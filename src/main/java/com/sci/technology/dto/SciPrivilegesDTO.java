package com.sci.technology.dto;

import javax.persistence.Column;

import lombok.Data;

@Data
public class SciPrivilegesDTO extends BaseEntityDTO {
	private SciUserDTO sciUserDTO;
	
	@Column(nullable = false)
	private String role;
	
	
}
