package com.sci.technology.dto;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Digits;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.Data;

@Data
public class SciOrderDTO extends BaseEntityDTO {
	@Column(nullable = false)
    private long sciUserId;
	
    private long sciPaymentId;

	@Column(nullable = false)
    private String delivery_address;
   
	@Column(nullable = false)
	@NumberFormat(style = Style.NUMBER)
    private double total;
   
   	@Column(nullable = false)
    private double latitude;
   
   	@Column(nullable = false)
    private double longitude;
    
    private long sci_transaction_id;
   
   	@Column(nullable = false)
   	@Digits(integer = 10, fraction = 0)
    private long contact;
    
    //one order can have multiple order_items
    @OneToMany(mappedBy="order")
	private Set<SciOrderItemDTO> orderItem;
    
    //one user can have multiple orders.
    @ManyToOne
    @JoinColumn(name="id", nullable=false)
    private SciUserDTO user;
    
    //one cart can have one order
    @OneToOne(mappedBy = "order")
    private SciCartDTO cart;
    
    //one order can have one payment
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "id", referencedColumnName = "id")
	 private SciPaymentDTO payment;
   
    
}
