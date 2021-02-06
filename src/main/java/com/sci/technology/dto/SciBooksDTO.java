package com.sci.technology.dto;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.Data;

@Data
public class SciBooksDTO extends BaseEntityDTO {
	@Column(nullable = false)
	@Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input")
	private String title;
	
	@Column(nullable = false)
	private String description;
	
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
	
	@Column(nullable = false)
	//@OneToMany(cascade = CascadeType.ALL)
	private long sciAuthorId;
	
	//one author can write multiple books
	@ManyToOne
    @JoinColumn(name="id", nullable=false)
    private SciAuthorDTO author;
	
    //one cart_item can have one book.
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "id", referencedColumnName = "id")
	 private SciBooksDTO books;

	 //one order_item can have one book.
	 @OneToOne(mappedBy = "books")
	 private SciOrderItemDTO orderItem;
	
	
}
