package com.sci.technology.dto;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class SciTransactionDTO extends BaseEntityDTO {

	@Column(nullable = false)
	private String content;

	private SciUserDTO sciUserDTO;

	private SciOrderDTO sciOrderDTO;

	private SciPaymentDTO sciPaymentDTO;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public SciUserDTO getSciUserDTO() {
		return sciUserDTO;
	}

	public void setSciUserDTO(SciUserDTO sciUserDTO) {
		this.sciUserDTO = sciUserDTO;
	}

	public SciOrderDTO getSciOrderDTO() {
		return sciOrderDTO;
	}

	public void setSciOrderDTO(SciOrderDTO sciOrderDTO) {
		this.sciOrderDTO = sciOrderDTO;
	}

	public SciPaymentDTO getSciPaymentDTO() {
		return sciPaymentDTO;
	}

	public void setSciPaymentDTO(SciPaymentDTO sciPaymentDTO) {
		this.sciPaymentDTO = sciPaymentDTO;
	}

}
