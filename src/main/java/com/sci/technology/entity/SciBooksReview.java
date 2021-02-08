package com.sci.technology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name = "sci_books_review")
@Data
@Builder
public class SciBooksReview extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sciBooksReviewId")
    protected long id;
	
//	@Column(nullable = false)
//    private long sciBooksId;
	
//	@Column(nullable = false)
//    private long sciUserId;
	
	@Column(name = "title",nullable = false)
    private String title;
	
	@Column(name = "rating",nullable = false)
    private int rating;
	
	@Column(name = "description")
    private String description;
	
	//one user can give multiple books reviews
	@ManyToOne
    @JoinColumn(name="sciUserId", nullable=false)
    private SciUser sciUser;
	
	@ManyToOne
    @JoinColumn(name="sciBooksId", nullable=false)
    private SciBooks sciBooks;
	
}
