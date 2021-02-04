package com.sci.technology.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "sci_categories")
@Data
public class SciCategories extends BaseEntity{
	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String description;
	
	//@Column(nullable = false)
	private long sciCategoriesId;
	
	//one categories can have multiple booksCategories.
	@OneToMany(mappedBy="categories")
	private Set<SciBooksCategories> booksCategories;
	
}
