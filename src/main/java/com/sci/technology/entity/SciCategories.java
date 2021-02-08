package com.sci.technology.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "sci_categories")
@Data
@Builder
public class SciCategories extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sciCategoriesId")
    protected long id;
	
	@Column(name = "name",nullable = false)
	private String name;

	@Column(name = "description",nullable = false)
	private String description;
	
//	//@Column(nullable = false)
//	private long sciCategoriesId;
	
	//one categories can have multiple booksCategories.
	@OneToMany(mappedBy="sciCategories")
	private Set<SciBooksCategories> sciBooksCategories;
	
}
