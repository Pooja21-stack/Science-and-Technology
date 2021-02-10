package com.sci.technology.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SciCategoriesDTO extends BaseEntityDTO {
	
	@Column(nullable = false)
	@Pattern(regexp = "^[A-Za-z]*$", message = "Invalid Input")
	private String name;

	@Column(nullable = false)
	private String description;

	private Set<SciBooksCategoriesDTO> sciBooksCategorieDTOs;

}
