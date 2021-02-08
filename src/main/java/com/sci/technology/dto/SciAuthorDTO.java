package com.sci.technology.dto;

import javax.persistence.Column;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class SciAuthorDTO extends BaseEntityDTO{
	
	@Column(nullable = false)
	@Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input")
    private String name;
	
	private String image;
	
   
}