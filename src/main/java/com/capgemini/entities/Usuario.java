package com.capgemini.entities;

/**
 * Usuarios registrados en el foro
 * 
 * @author Miguel
 */ 
public class Usuario {

	private String nickname;
	private String password;
	
	public Usuario() {
		super();
	}
	
	public Usuario(String nickname, String password) {
		super();
		this.nickname = nickname;
		this.password = password;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
