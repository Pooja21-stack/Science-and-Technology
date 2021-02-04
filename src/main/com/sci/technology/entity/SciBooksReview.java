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
public class SciBooksReview extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Getter
	@Setter
	@Column(nullable = false)
    private long sciBooksId;
	
	@Getter
	@Setter
	@Column(nullable = false)
    private long sciUserId;
	
	@Getter
	@Setter
	
    private String title;
	
	@Getter
	@Setter
	
    private int rating;
	
	@Getter
	@Setter
    private String description;
	
	//one user can give multiple books reviews
	@ManyToOne
    @JoinColumn(name="id", nullable=false)
    private SciUser userBooksReview;
	
}
