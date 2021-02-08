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

	private SciBooksDTO sciBooksDTO;
	
    private SciCartDTO sciCartDTO;
//
//	@NumberFormat(style = Style.NUMBER)
//    private double price;

	@Column(nullable = false)
	@NumberFormat(style = Style.NUMBER)
    private int quantity;
	

}
