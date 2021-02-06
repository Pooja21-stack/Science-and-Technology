package com.sci.technology.dto;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.Data;

@Data
public class SciCartItemDTO extends BaseEntityDTO {

	@Column(nullable = false)
    private long sciBooksId;
	
	@Column(nullable = false)
    private long sciCartId;

	@Column(nullable = false)
    private String sku;

	@NumberFormat(style = Style.NUMBER)
    private double price;

	@Column(nullable = false)
	@NumberFormat(style = Style.NUMBER)
    private int quantity;
	
	//one cart can contain multiple cart items
	@ManyToOne
    @JoinColumn(name="id", nullable=false)
    private SciCartDTO cart;
	
	//one cart_item can have one book.
	@OneToOne(mappedBy = "books")
	private SciCartItemDTO cartItem;
}
