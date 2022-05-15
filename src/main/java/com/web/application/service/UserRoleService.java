package com.web.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.application.entity.User_Role;
import com.web.application.model.SearchCriteria;
import com.web.application.repository.UserRoleRepository;
import com.web.application.specification.UserRoleSpecification;


@Service
public class UserRoleService {
	
	@Autowired
	private UserRoleRepository userRoleRepository;

	public List<User_Role> getUser(List<SearchCriteria> sc) {
		return userRoleRepository.findAll(UserRoleSpecification.findByCriteria(sc));
	}
}
	
