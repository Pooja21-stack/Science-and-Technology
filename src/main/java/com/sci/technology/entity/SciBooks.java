package com.sci.technology.entity;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "sci_books")
@Data
@Builder
public class SciBooks extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    protected long id;	

	@Column(name = "title",nullable = false)
	private String title;
	
	@Column(name = "description",nullable = false)
	private String description;
	
	@Column(name = "sku",nullable = false)
    private String sku;
	
	@Column(name = "price",nullable = false)
	private double price;
	
	@Column(name = "as_available",nullable = false)
	private boolean isAvailable;
	
	@Column(name = "quantity",nullable = false)
	private int quantity;
	
	@Column(name = "publishing_date",nullable = false)
	private Date publishingDate;
	
	@Column(name = "image",nullable = false)
	private String image;

	
	//one author can write multiple books
	@ManyToOne
    @JoinColumn(name="sciAuthorId", nullable=false)
    private SciAuthor sciAuthor;
	
	//one cart_item can have one book.
	@OneToOne
	@JoinColumn(name = "sciCartItemId")
	private SciCartItem sciCartItem;

	//one order_item can have one book.
	@OneToOne
	@JoinColumn(name = "sciOrderItemId")
	private SciOrderItem sciOrderItem;
	 
	//one book_categories can have multiple books.
	@ManyToOne
	@JoinColumn(name = "sciBooksCategoriesId")
	private SciBooksCategories sciBooksCategories;
	
	@OneToMany(mappedBy="sciBooks")
	private Set<SciBooksReview> sciBooksReview;
	
}
