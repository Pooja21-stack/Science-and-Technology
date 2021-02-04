package com.sci.technology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name = "sci_books_review")
@Data
public class SciBooksReview extends BaseEntity {
	
	@Column(nullable = false)
    private long sciBooksId;
	
	
	@Column(nullable = false)
    private long sciUserId;
	
    private String title;
	
    private int rating;
	
    private String description;
	
	//one user can give multiple books reviews
	@ManyToOne
    @JoinColumn(name="id", nullable=false)
    private SciUser userBooksReview;
	
}
