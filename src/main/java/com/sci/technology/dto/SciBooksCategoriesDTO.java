package com.sci.technology.dto;

import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.sci.technology.entity.SciBooks;
import com.sci.technology.entity.SciCategories;

import lombok.Data;

@Data
public class SciBooksCategoriesDTO extends BaseEntityDTO {
	
    private Set<SciBooksDTO> sciBooksDTO;
    
    private Set<SciCategoriesDTO> sciCategoriesDTO;
	
   
}