package com.sci.technology.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class SciAuthorDTO extends BaseEntityDTO{
	@Column(nullable = false)
	@Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input")
    private String name;
	
	private String image;
	
	//one author can write multiple books
	@OneToMany(mappedBy="author")
	private Set<SciBooksDTO> books;
    
   
}