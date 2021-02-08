package com.sci.technology.dto;

import java.util.Set;

import lombok.Data;


@Data
public class SciCartDTO extends BaseEntityDTO {
	private Set<SciCartItemDTO> sciCartItemDTO;
	
}
