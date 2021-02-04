package com.sci.technology.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name = "sci_categories")
public class SciCategories extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private String name;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private String description;
	
	@Getter
	@Setter
	//@Column(nullable = false)
	private long sciCategoriesId;
	
	//one categories can have multiple booksCategories.
	@OneToMany(mappedBy="categories")
	private Set<SciBooksCategories> booksCategories;
	
}
