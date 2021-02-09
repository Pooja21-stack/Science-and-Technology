package com.sci.technology.dto;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SciBooksDTO extends BaseEntityDTO {
	@Column(nullable = false)
	@Pattern(regexp = "^[A-Za-z]*$", message = "Invalid Input")
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
	// @JsonFormat(pattern="yyyy-MM-dd")
	private Date publishingDate;

	@Column(nullable = false)
	private String image;

	private SciAuthorDTO sciAuthorDTO;

	private Set<SciBooksReviewDTO> sciBooksReviewDTO;
//	

}
