package com.web.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name = "USER_ROLE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class User_Role {
	
	@Id
	@Column(name = "ID")
	private String id;
	@Column(name ="NAME")
	private String name;
	@Column(name ="EMAIL_ID")
	private String email_id;
	
//	@OneToOne(fetch=FetchType.LAZY)
//@Fetch(value=FetchMode.SELECT)
	

}

	
	
	
	
	
