package com.sci.technology.dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SciBooksCategoriesDTO extends BaseEntityDTO {

	private Set<SciBooksDTO> sciBooksDTO;

	private Set<SciCategoriesDTO> sciCategoriesDTO;

	public Set<SciBooksDTO> getSciBooksDTO() {
		return sciBooksDTO;
	}

	public void setSciBooksDTO(Set<SciBooksDTO> sciBooksDTO) {
		this.sciBooksDTO = sciBooksDTO;
	}

	public Set<SciCategoriesDTO> getSciCategoriesDTO() {
		return sciCategoriesDTO;
	}

	public void setSciCategoriesDTO(Set<SciCategoriesDTO> sciCategoriesDTO) {
		this.sciCategoriesDTO = sciCategoriesDTO;
	}

}