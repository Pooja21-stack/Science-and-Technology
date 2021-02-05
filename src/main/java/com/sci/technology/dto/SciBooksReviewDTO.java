package com.sci.technology.dto;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
public class SciBooksReviewDTO extends BaseEntityDTO {
	
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
    private SciUserDTO userBooksReview;


	
}
