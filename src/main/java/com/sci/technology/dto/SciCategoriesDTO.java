package com.sci.technology.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SciCategoriesDTO extends BaseEntityDTO {
	
	@Column(nullable = false)
	@Pattern(regexp = "^[A-Za-z]*$", message = "Invalid Input")
	private String name;

	@Column(nullable = false)
	private String description;

	private Set<SciBooksCategoriesDTO> sciBooksCategorieDTOs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<SciBooksCategoriesDTO> getSciBooksCategorieDTOs() {
		return sciBooksCategorieDTOs;
	}

	public void setSciBooksCategorieDTOs(Set<SciBooksCategoriesDTO> sciBooksCategorieDTOs) {
		this.sciBooksCategorieDTOs = sciBooksCategorieDTOs;
	}

}
