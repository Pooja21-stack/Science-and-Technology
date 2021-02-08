package com.sci.technology.dto;
import javax.persistence.Column;

import lombok.Data;

@Data
public class SciUserTypeDTO extends BaseEntityDTO {
	@Column(nullable = false)
	private String userType;

	@Column(nullable = false)
	private SciDesignationDTO sciDesignationDTO;
}
