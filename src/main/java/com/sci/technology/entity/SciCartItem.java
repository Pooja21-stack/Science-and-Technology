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

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "sci_cart_item")
@Data
@Builder
public class SciCartItem extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sciCartItemId")
    protected long id;
	
	@Column(name = "price")
    private double price;

	@Column(nullable = false)
    private int quantity;
	
	//one cart can contain multiple cart items
	@ManyToOne
    @JoinColumn(name="sciCartId", nullable=false)
    private SciCart sciCart;
	
	//one cart_item can have one book.
	 @OneToOne(mappedBy = "sciBooks", cascade = CascadeType.ALL)
	 private SciCartItem sciCartItem;

}
