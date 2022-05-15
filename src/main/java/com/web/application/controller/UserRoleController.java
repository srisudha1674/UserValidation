package com.web.application.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.application.entity.User_Role;
	import com.web.application.model.SearchCriteria;
import com.web.application.service.UserRoleService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UserRoleController {
	
	@Autowired
	private UserRoleService userRoleService;
	
//	@RequestMapping("/userrole")
//	public List<User_Role> getAllTopics()
//	{
//		return userRoleService.getUser();
//	}
	
	@GetMapping("/userrole")
	//search criteria JPA
	public List<User_Role> getTopics(@RequestParam(name = "id",required = false) String id,
			@RequestParam(name= "name",required = false) String name,
			@RequestParam(name = "email_id",required = false) String email_id)
	{
		SearchCriteria sc = new SearchCriteria();
		System.out.println(id);
//		Logger logger = LoggerFactory.getLogger(TopicController.class);
		if(id != null)
		{
			sc.setId(id);
			log.error(" error print");
			
			log.info("info print");
			log.trace("trace print");
			log.debug("debug print");
			log.warn("warn print");
		}
		if(name != null)
		{
			sc.setName(name);
		}
		if(email_id != null)
		{
			sc.setEmail_id(email_id);
		}
			List<User_Role> roles = userRoleService.getUser(Arrays.asList(sc));
//			if(roles.isEmpty())
//			{
//				throw new RecordNotFoundException(new ErrorBean(905,"No record exist with given Id"));
//			}
			return roles;
			
	}

}
