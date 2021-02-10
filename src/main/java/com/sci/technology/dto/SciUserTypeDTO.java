package com.sci.technology.dto;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class SciUserTypeDTO extends BaseEntityDTO {
	@Column(nullable = false)
	private String userType;

	@Column(nullable = false)
	private SciDesignationDTO sciDesignationDTO;
	
}
