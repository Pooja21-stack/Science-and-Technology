package com.sci.technology.dto;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SciCompanyDTO extends BaseEntityDTO {

	@Column(nullable = false)
	private String profile;

	@Column(nullable = false)
	private String about;

}
