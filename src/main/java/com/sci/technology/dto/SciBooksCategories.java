package com.sci.technology.dto;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name="sci_books_categories")
@Data
public class SciBooksCategories extends BaseEntityDTO {
	
    private long sciBooksId;
    
    private long sciCategoriesId;
	
	//one categories can have multiple booksCategories.
	@ManyToOne
    @JoinColumn(name="id", nullable=false)
    private SciCategoriesDTO categories;
	
}