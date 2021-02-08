package com.sci.technology.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "sci_user")
@Data
@Builder
public class SciUserType extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sciUserTypeId")
    protected long id;
	
	@Column(name = "user_type",nullable = false)
	private String userType;
	
	//one user can of one user type
	 @OneToOne
	 @JoinColumn(name = "sciUserId")
	 private SciUser sciUser;
	
	//one usertype can have multiple privileges
	@OneToMany(mappedBy="userTypePrivilege")
	private Set<SciPrivileges> privileges;
	
	 //one usertype can have one designation
	 @OneToOne(mappedBy = "sciUserType", cascade = CascadeType.ALL)
	 private SciDesignation sciDesignation;

	
}
