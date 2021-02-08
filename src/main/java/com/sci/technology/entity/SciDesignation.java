package com.sci.technology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
@Entity
@Table(name = "sci_designation")
@Data
@Builder
public class SciDesignation extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sciDesignationId")
    protected long id;
	
	@Column(name = "type",nullable = false)
	private String type;
	
	//one user can have one designation
	@OneToOne
	@JoinColumn(name = "sciUserId")
	private SciUser sciUser;
	
	//one usertype can have one designation
	@OneToOne
	@JoinColumn(name = "sciUserTypeId")
	private SciUserType sciUserType;
	
}
