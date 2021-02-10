package com.sci.technology.dto;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SciPrivilegesDTO extends BaseEntityDTO {

	private SciUserDTO sciUserDTO;

	@Column(nullable = false)
	private String role;

	public SciUserDTO getSciUserDTO() {
		return sciUserDTO;
	}

	public void setSciUserDTO(SciUserDTO sciUserDTO) {
		this.sciUserDTO = sciUserDTO;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
