package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entities.User;

@Repository
public interface IUserDao extends JpaRepository<User, Long>  {

}
