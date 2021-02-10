package com.sci.technology.dto;

import javax.persistence.Column;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public SciOrderDTO getSciOrderDTO() {
		return sciOrderDTO;
	}

	public void setSciOrderDTO(SciOrderDTO sciOrderDTO) {
		this.sciOrderDTO = sciOrderDTO;
	}

	public SciTransactionDTO getSciTransactionDTO() {
		return sciTransactionDTO;
	}

	public void setSciTransactionDTO(SciTransactionDTO sciTransactionDTO) {
		this.sciTransactionDTO = sciTransactionDTO;
	}

}
