package com.sci.technology.entity;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "sci_books")
@Data
@Builder
public class SciBooks extends BaseEntity {

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
    private SciAuthor author;
	
	//one cart_item can have one book.
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "id", referencedColumnName = "id")
	 private SciBooks books;

	 //one order_item can have one book.
	 @OneToOne(mappedBy = "books")
	 private SciOrderItem orderItem;
	
}
