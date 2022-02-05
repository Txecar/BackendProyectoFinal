package com.capgemini.service.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.capgemini.controllers.dto.UsuarioRegistroDTO;
import com.capgemini.dao.IUserDao;
import com.capgemini.entities.Role;
import com.capgemini.entities.Usuario;
import com.capgemini.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	private IUserDao userDao;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public UserServiceImpl(IUserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Usuario guardar(UsuarioRegistroDTO registroDTO) {
		Usuario usuario = new Usuario(registroDTO.getNombre(), registroDTO.getApellidos(), registroDTO.getNick(),
				passwordEncoder.encode(registroDTO.getPassword()), registroDTO.getEmail(), Arrays.asList(new Role("Usuario")));
		return userDao.save(usuario);
	}

	@Override
	public List<Usuario> listarUsuarios() {
		userDao.findAll();
		return null;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = userDao.findByEmail(username);
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario y contraseña invalidos");
		}
		return new User(usuario.getEmail(), usuario.getPassword(), mapearAutoridadesRoles(usuario.getRoles()));
	}
	
	private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Role> roles){
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getAutorizacion())).collect(Collectors.toList());
	}

}
