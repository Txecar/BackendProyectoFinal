package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entities.Post;

@Repository
public interface IPostDao extends JpaRepository<Post, Long> {

}
