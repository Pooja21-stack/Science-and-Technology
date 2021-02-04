package com.sci.technology.entity;

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
@Table(name = "sci_cart_item")
public class SciCartItem extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Getter
	@Setter
	@Column(nullable = false)
    private long sciBooksId;
	
	@Getter
	@Setter
	@Column(nullable = false)
    private long sciCartId;
	
	@Getter
	@Setter
	@Column(nullable = false)
    private String sku;
	
	@Getter
	@Setter
    private double price;
	
	@Getter
	@Setter
	@Column(nullable = false)
    private int quantity;
	
	//one cart can contain multiple cart items
	@ManyToOne
    @JoinColumn(name="id", nullable=false)
    private SciCart cart;
	
	//one cart_item can have one book.
	 @OneToOne(mappedBy = "books")
	 private SciCartItem cartItem;

}
