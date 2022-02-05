package com.capgemini.entities;

import java.io.Serializable;

/**
 * Comentarios publicados en el foro
 * 
 * @author Andres
 */ 

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Comment implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String content;
    private Date publish_date;
    
	@OneToOne
	//(fetch = FetchType.LAZY,  cascade = CascadeType.MERGE, mappedBy = "comment")
	private Usuario user;

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(int id, String content, Date publish_date, Usuario user) {
		super();
		this.id = id;
		this.content = content;
		this.publish_date = publish_date;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPublish_date() {
		return publish_date;
	}

	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
    	

}
