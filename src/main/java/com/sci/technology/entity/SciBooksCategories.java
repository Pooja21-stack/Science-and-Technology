package com.sci.technology.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="sci_books_categories")
@Data
@Builder
public class SciBooksCategories extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
	
    private SciBook sciBook;
    
    private SciCategories sciCategoriesId;
	
	//one categories can have multiple booksCategories.
	@ManyToOne
    @JoinColumn(name="id", nullable=false)
    private SciCategories categories;
	
}