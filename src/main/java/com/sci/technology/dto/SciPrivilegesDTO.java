package com.sci.technology.dto;

import javax.persistence.Column;

import lombok.Data;

@Data
public class SciPrivilegesDTO extends BaseEntityDTO {
	@Column(nullable = false)
	private long sciUserId;
	
	@Column(nullable = false)
	private String role;
	
	
}
