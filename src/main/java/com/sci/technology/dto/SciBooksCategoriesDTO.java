package com.sci.technology.dto;

import java.util.Set;

import lombok.Data;

@Data
public class SciBooksCategoriesDTO extends BaseEntityDTO {
	
    private Set<SciBooksDTO> sciBooksDTO;
    
    private Set<SciCategoriesDTO> sciCategoriesDTO;
	
   
}