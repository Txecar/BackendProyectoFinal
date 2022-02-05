package com.capgemini.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.capgemini.controllers.dto.UsuarioRegistroDTO;
import com.capgemini.entities.Usuario;


public interface IUserService extends UserDetailsService {
	
    public Usuario guardar(UsuarioRegistroDTO registroDTO);
	
	public List<Usuario> listarUsuarios();

}
