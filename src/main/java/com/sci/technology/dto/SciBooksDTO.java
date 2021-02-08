package com.sci.technology.dto;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import com.sci.technology.entity.SciAuthor;
import com.sci.technology.entity.SciBooksCategories;
import com.sci.technology.entity.SciBooksReview;
import com.sci.technology.entity.SciCartItem;
import com.sci.technology.entity.SciOrderItem;

import lombok.Data;

@Data
public class SciBooksDTO extends BaseEntityDTO {
	@Column(nullable = false)
	@Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input")
	private String title;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
    private String sku;
	
	@Column(nullable = false)
	@NumberFormat(style = Style.NUMBER)
	private double price;
	
	@Column(nullable = false)
	private boolean isAvailable;
	
	@Column(nullable = false)
	@NumberFormat(style = Style.NUMBER)
	private int quantity;
	
	@Column(nullable = false)
	//@JsonFormat(pattern="yyyy-MM-dd")
	private Date publishingDate;
	
	@Column(nullable = false)
	private String image;
	
	private SciAuthorDTO sciAuthorDTO;
	
	private Set<SciBooksReviewDTO> sciBooksReviewDTO;
//	
	
	
	
}
