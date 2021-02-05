package com.sci.technology.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class SciCategoriesDTO extends BaseEntityDTO{
	@Column(nullable = false)
	@Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input")
	private String name;

	@Column(nullable = false)
	private String description;
	
	//@Column(nullable = false)
	private long sciCategoriesId;
	
	//one categories can have multiple booksCategories.
	@OneToMany(mappedBy="categories")
	private Set<SciBooksCategoriesDTO> booksCategories;
	
}
