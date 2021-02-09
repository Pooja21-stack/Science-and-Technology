package com.sci.technology.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.validation.constraints.Digits;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SciOrderDTO extends BaseEntityDTO {
	private SciUserDTO sciUserDTO;

	private SciPaymentDTO sciPaymentDTO;

	@Column(nullable = false)
	private String delivery_address;

	@Column(nullable = false)
	@NumberFormat(style = Style.NUMBER)
	private double total;

	@Column(nullable = false)
	private double latitude;

	@Column(nullable = false)
	private double longitude;

	private SciTransactionDTO sciTransactionDTO;

	private SciCartDTO sciCartDTO;

	private Set<SciOrderItemDTO> sciOrderItemDTO;

	@Column(nullable = false)
	@Digits(integer = 10, fraction = 0)
	private long contact;

}
