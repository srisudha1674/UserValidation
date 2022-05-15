package com.web.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.web.application.entity.User_Role;


public interface UserRoleRepository extends JpaRepository<User_Role, String>,JpaSpecificationExecutor<User_Role>{

}
