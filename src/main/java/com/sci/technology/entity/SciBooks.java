package com.sci.technology.entity;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import lombok.*;

@Entity
@Table(name = "sci_books")
public class SciBooks extends BaseEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private String title;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private String description;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private double price;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private boolean isAvailable;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private int quantity;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private Date publishingDate;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private String image;
	
	@Getter
	@Setter
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
