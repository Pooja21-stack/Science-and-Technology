package com.sci.technology.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.Data;

@Data
public class SciPaymentDTO extends BaseEntityDTO {
	@Column(nullable = false)
    private String type;
  
	@Column(nullable = false)
	@NumberFormat(style = Style.NUMBER)
    private double amount;
    
	@Column(nullable = false)
    private String mode;

    private SciOrderDTO sciOrderDTO;
    
	private SciTransactionDTO sciTransactionDTO;
	
  
}
