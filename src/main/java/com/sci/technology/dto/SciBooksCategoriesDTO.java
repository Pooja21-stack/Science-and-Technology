package com.sci.technology.dto;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;

@Data
public class SciBooksCategoriesDTO extends BaseEntityDTO {
	
    private long sciBooksId;
    
    private long sciCategoriesId;
	
	//one categories can have multiple booksCategories.
	@ManyToOne
    @JoinColumn(name="id", nullable=false)
    private SciCategoriesDTO categories;
	
}