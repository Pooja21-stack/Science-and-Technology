package com.sci.technology.dto;

import javax.persistence.Column;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class SciOrderItemDTO extends BaseEntityDTO {
	
	private SciOrderDTO sciOrderDTO;

	@Column(nullable = false)
	@NumberFormat(style = Style.NUMBER)
	private int quantity;

	private SciBooksDTO sciBooksDTO;

	public SciOrderDTO getSciOrderDTO() {
		return sciOrderDTO;
	}

	public void setSciOrderDTO(SciOrderDTO sciOrderDTO) {
		this.sciOrderDTO = sciOrderDTO;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public SciBooksDTO getSciBooksDTO() {
		return sciBooksDTO;
	}

	public void setSciBooksDTO(SciBooksDTO sciBooksDTO) {
		this.sciBooksDTO = sciBooksDTO;
	}

}
