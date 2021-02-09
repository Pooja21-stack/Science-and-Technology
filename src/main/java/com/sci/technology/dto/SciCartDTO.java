package com.sci.technology.dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class SciCartDTO extends BaseEntityDTO {
	private Set<SciCartItemDTO> sciCartItemDTO;

	public Set<SciCartItemDTO> getSciCartItemDTO() {
		return sciCartItemDTO;
	}

	public void setSciCartItemDTO(Set<SciCartItemDTO> sciCartItemDTO) {
		this.sciCartItemDTO = sciCartItemDTO;
	}

}
