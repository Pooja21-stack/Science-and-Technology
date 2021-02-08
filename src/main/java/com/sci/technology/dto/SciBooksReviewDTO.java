package com.sci.technology.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Pattern;

import com.sci.technology.entity.SciBooks;
import com.sci.technology.entity.SciUser;

import lombok.Data;

@Data
public class SciBooksReviewDTO extends BaseEntityDTO {
	@Column(nullable = false)
	@Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input")
    private String title;
	
    private int rating;
	
    private String description;
	
}
