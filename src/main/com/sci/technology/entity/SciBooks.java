<<<<<<< HEAD:src/main/com/sci/technology/entity/SciBooks.java
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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sci_books")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SciBooks extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;

	@Column(name = "title", nullable = false)
	private String title;

	@Column(name = "description", nullable = false)
	private String description;

	@Column(name = "sku", nullable = false)
	private String sku;

	@Column(name = "price", nullable = false)
	private double price;

	@Column(name = "is_available", nullable = false)
	private boolean isAvailable;

	@Column(name = "quantity", nullable = false)
	private int quantity;

	@Column(name = "publishing_date", nullable = false)
	private Date publishingDate;

	@Column(name = "image", nullable = false)
	private String image;

	// one author can write multiple books
	@ManyToOne
	@JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
	private SciAuthor sciAuthor;

	// one cart_item can have one book.
	@OneToOne
	@JoinColumn(name = "id")
	private SciCartItem sciCartItem;

	// one order_item can have one book.
	@OneToOne
	@JoinColumn(name = "id")
	private SciOrderItem sciOrderItem;

	// one book_categories can have multiple books.
	@ManyToOne
	@JoinColumn(name = "id", insertable = false, updatable = false)
	private SciBooksCategories sciBooksCategories;

	@OneToMany(mappedBy = "sciBooks")
	private Set<SciBooksReview> sciBooksReview;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getPublishingDate() {
		return publishingDate;
	}

	public void setPublishingDate(Date publishingDate) {
		this.publishingDate = publishingDate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public SciAuthor getSciAuthor() {
		return sciAuthor;
	}

	public void setSciAuthor(SciAuthor sciAuthor) {
		this.sciAuthor = sciAuthor;
	}

	public SciCartItem getSciCartItem() {
		return sciCartItem;
	}

	public void setSciCartItem(SciCartItem sciCartItem) {
		this.sciCartItem = sciCartItem;
	}

	public SciOrderItem getSciOrderItem() {
		return sciOrderItem;
	}

	public void setSciOrderItem(SciOrderItem sciOrderItem) {
		this.sciOrderItem = sciOrderItem;
	}

	public SciBooksCategories getSciBooksCategories() {
		return sciBooksCategories;
	}

	public void setSciBooksCategories(SciBooksCategories sciBooksCategories) {
		this.sciBooksCategories = sciBooksCategories;
	}

	public Set<SciBooksReview> getSciBooksReview() {
		return sciBooksReview;
	}

	public void setSciBooksReview(Set<SciBooksReview> sciBooksReview) {
		this.sciBooksReview = sciBooksReview;
	}

}
=======
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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sci_books")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SciBooks extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;

	@Column(name = "title", nullable = false)
	private String title;

	@Column(name = "description", nullable = false)
	private String description;

	@Column(name = "sku", nullable = false)
	private String sku;

	@Column(name = "price", nullable = false)
	private double price;

	@Column(name = "is_available", nullable = false)
	private boolean isAvailable;

	@Column(name = "quantity", nullable = false)
	private int quantity;

	@Column(name = "publishing_date", nullable = false)
	private Date publishingDate;

	@Column(name = "image", nullable = false)
	private String image;

	// one author can write multiple books
	@ManyToOne
	@JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
	private SciAuthor sciAuthor;

	// one cart_item can have one book.
	@OneToOne
	@JoinColumn(name = "id")
	private SciCartItem sciCartItem;

	// one order_item can have one book.
	@OneToOne
	@JoinColumn(name = "id")
	private SciOrderItem sciOrderItem;

	// one book_categories can have multiple books.
	@ManyToOne
	@JoinColumn(name = "id", insertable = false, updatable = false)
	private SciBooksCategories sciBooksCategories;

	@OneToMany(mappedBy = "sciBooks")
	private Set<SciBooksReview> sciBooksReview;

}
>>>>>>> parent of 356dd16... Mapper Implementation Completed (without lombok):src/main/java/com/sci/technology/entity/SciBooks.java
