package com.sci.technology.dto;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SciTransactionDTO extends BaseEntityDTO {

	@Column(nullable = false)
	private String content;

	private SciUserDTO sciUserDTO;

	private SciOrderDTO sciOrderDTO;

	private SciPaymentDTO sciPaymentDTO;

}
