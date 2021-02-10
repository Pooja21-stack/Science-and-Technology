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
@Table(name = "sci_order_item")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SciOrderItem extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;

	@Column(name = "quantity", nullable = false)
	private int quantity;

	// one order can have multiple order_items
	@ManyToOne
	@JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
	private SciOrder sciOrder;

	// one order_item can have one book.
	@OneToOne(mappedBy = "sciOrderItem", cascade = CascadeType.ALL)
	private SciBooks sciBooks;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public SciOrder getSciOrder() {
		return sciOrder;
	}

	public void setSciOrder(SciOrder sciOrder) {
		this.sciOrder = sciOrder;
	}

	public SciBooks getSciBooks() {
		return sciBooks;
	}

	public void setSciBooks(SciBooks sciBooks) {
		this.sciBooks = sciBooks;
	}
}
