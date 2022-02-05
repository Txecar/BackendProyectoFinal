package com.capgemini.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie implements Serializable {
	
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    private String description;
    private String name;
  
    @OneToMany(mappedBy = "categorie")
	private List<Post> posts;

	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categorie(Long id, String description, String name, List<Post> posts) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.posts = posts;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    

}
