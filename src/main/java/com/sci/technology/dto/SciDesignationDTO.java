package com.sci.technology.dto;

import javax.persistence.Column;

import lombok.Data;

@Data
public class SciDesignationDTO extends BaseEntityDTO {
	
	@Column(nullable = false)
	private String type;
	
	
}
