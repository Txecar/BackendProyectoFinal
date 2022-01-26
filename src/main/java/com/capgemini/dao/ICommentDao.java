package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entities.Comment;

public interface ICommentDao extends JpaRepository<Comment, Long> {

}
