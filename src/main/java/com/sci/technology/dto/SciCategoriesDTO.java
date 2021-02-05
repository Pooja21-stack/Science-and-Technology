package com.sci.technology.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
public class SciCategoriesDTO extends BaseEntityDTO{
	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String description;
	
	//@Column(nullable = false)
	private long sciCategoriesId;
	
	//one categories can have multiple booksCategories.
	@OneToMany(mappedBy="categories")
	private Set<SciBooksCategoriesDTO> booksCategories;
	
}
