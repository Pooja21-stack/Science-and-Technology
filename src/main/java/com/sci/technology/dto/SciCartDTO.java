package com.sci.technology.dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class SciCartDTO extends BaseEntityDTO {
	
	private Set<SciCartItemDTO> sciCartItemDTO;


}
