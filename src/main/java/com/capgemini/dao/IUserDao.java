package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entities.Usuario;

@Repository
public interface IUserDao extends JpaRepository<Usuario, Long>  {
	
	public Usuario findByEmail(String email);

}
