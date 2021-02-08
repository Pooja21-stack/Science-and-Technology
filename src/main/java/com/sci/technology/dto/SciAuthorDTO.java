package com.sci.technology.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;

import com.sci.technology.entity.SciBooks;

import lombok.Data;

@Data
public class SciAuthorDTO extends BaseEntityDTO{
	
	@Column(nullable = false)
	@Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input")
    private String name;
	
	private String image;
	
   
}