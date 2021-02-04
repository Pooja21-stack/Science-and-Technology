package com.sci.technology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.*;

@Entity
@Table(name = "sci_company")
public class SciCompany extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private String profile;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private String about;
	
	
}
