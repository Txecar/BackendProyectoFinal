package com.capgemini.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.controllers.dto.UsuarioRegistroDTO;
import com.capgemini.service.IUserService;


@Controller
@RequestMapping("/registro")
public class RegistroUsuarioController { 
	
	private IUserService userService;
	
	public RegistroUsuarioController(IUserService userService) {
		super();
		this.userService = userService;
	}

	@ModelAttribute("usuario")
	public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
		return new UsuarioRegistroDTO();
	}

	@GetMapping
	public String mostrarFormularioDeRegistro() {
		return "registro";
	}
	
	@PostMapping
	public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO) {
		userService.guardar(registroDTO);
		return "redirect:/registro?exito";
	}

}
