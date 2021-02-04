package com.sci.technology.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.*;

@Entity
@Table(name="sci_books_categories")
public class SciBooksCategories extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Getter
	@Setter
    private long sciBooksId;
	
	@Getter
	@Setter
    private long sciCategoriesId;
	
	//one categories can have multiple booksCategories.
	@ManyToOne
    @JoinColumn(name="id", nullable=false)
    private SciCategories categories;
	
}