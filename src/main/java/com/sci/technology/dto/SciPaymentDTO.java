package com.sci.technology.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
public class SciPaymentDTO extends BaseEntityDTO {
	@Column(nullable = false)
    private String type;
  
	@Column(nullable = false)
    private double amount;
    
	@Column(nullable = false)
    private String mode;
	
	
    //one order can have one payment
    @OneToOne(mappedBy = "payment")
    private SciOrderDTO order;
    
    //one payment can have one transaction
    @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id", referencedColumnName = "id")
	private SciTransactionDTO transaction;
	
  
}
