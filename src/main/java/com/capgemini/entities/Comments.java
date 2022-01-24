package com.capgemini.entities;

import java.io.Serializable;

/**
 * Comentarios publicados en el foro
 * 
 * @author Andres
 */ 

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Comments implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String content;
    private Date publish_date;
    private int post_id;
    private int user_id;
    
	@OneToMany(fetch = FetchType.LAZY,  cascade = CascadeType.MERGE, mappedBy = "presentacion")
	private List<Usuario> usuarios;
    	

}
