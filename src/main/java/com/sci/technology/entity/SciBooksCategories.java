package com.sci.technology.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@Column(name = "sciBooksCategoriesId")
    protected long id;
//	
//    private long sciBooksId;
//    
//    private long sciCategoriesId;
	
	//one categories can have multiple booksCategories.
	@ManyToOne
    @JoinColumn(name="sciCategoriesId", nullable=false)
    private SciCategories sciCategories;
	
	//one book_categories can have multiple books.
	@OneToMany(mappedBy = "sciBooksCategories")
    private Set<SciBooks> sciBooks;
	
}