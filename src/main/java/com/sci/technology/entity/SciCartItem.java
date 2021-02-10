package com.sci.technology.entity;

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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sci_cart_item")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SciCartItem extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;

	@Column(name = "price")
	private double price;

	@Column(nullable = false)
	private int quantity;

	// one cart can contain multiple cart items
	@ManyToOne
	@JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
	private SciCart sciCart;

	// one cart_item can have one book.
	@OneToOne(mappedBy = "sciCartItem", cascade = CascadeType.ALL)
	private SciBooks sciBooks;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public SciCart getSciCart() {
		return sciCart;
	}

	public void setSciCart(SciCart sciCart) {
		this.sciCart = sciCart;
	}

	public SciBooks getSciBooks() {
		return sciBooks;
	}

	public void setSciBooks(SciBooks sciBooks) {
		this.sciBooks = sciBooks;
	}

}
