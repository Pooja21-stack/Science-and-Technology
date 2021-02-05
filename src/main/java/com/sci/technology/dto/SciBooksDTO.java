package com.sci.technology.dto;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
public class SciBooksDTO extends BaseEntityDTO {
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
	private double price;
	
	@Column(nullable = false)
	private boolean isAvailable;
	
	@Column(nullable = false)
	private int quantity;
	
	@Column(nullable = false)
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
