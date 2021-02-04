package com.sci.technology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name = "sci_company")
@Data
public class SciCompany extends BaseEntity {
	@Column(nullable = false)
	private String profile;
	
	@Column(nullable = false)
	private String about;
	
	
}
