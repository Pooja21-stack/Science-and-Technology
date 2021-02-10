package com.sci.technology.dto;

import javax.persistence.Column;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
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
