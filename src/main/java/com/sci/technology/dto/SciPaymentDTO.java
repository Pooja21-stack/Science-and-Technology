package com.sci.technology.dto;

import javax.persistence.Column;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
