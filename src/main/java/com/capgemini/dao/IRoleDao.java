package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entities.Role;

@Repository
public interface IRoleDao extends JpaRepository<Role, Long> {

}
