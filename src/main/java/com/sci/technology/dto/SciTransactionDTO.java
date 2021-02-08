package com.sci.technology.dto;
import javax.persistence.Column;
import lombok.Data;

@Data
public class SciTransactionDTO extends BaseEntityDTO {
	@Column(nullable = false)
	private String content;
	
	private SciUserDTO sciUserDTO;
	
	private SciOrderDTO sciOrderDTO;

	private SciPaymentDTO sciPaymentDTO;
	
	
}
