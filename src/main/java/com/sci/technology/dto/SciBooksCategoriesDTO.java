package com.sci.technology.dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SciBooksCategoriesDTO extends BaseEntityDTO {

	private Set<SciBooksDTO> sciBooksDTO;

	private Set<SciCategoriesDTO> sciCategoriesDTO;


}