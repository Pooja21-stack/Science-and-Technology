package com.sci.technology.dto;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SciPrivilegesDTO extends BaseEntityDTO {

	private SciUserDTO sciUserDTO;

	@Column(nullable = false)
	private String role;

}
