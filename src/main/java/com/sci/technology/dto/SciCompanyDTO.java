package com.sci.technology.dto;

import javax.persistence.Column;

import lombok.Data;

@Data
public class SciCompanyDTO extends BaseEntityDTO {
	@Column(nullable = false)
	private String profile;
	
	@Column(nullable = false)
	private String about;
	
	
}
