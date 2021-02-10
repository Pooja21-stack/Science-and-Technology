package com.sci.technology.dto;

import javax.persistence.Column;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class SciCartItemDTO extends BaseEntityDTO {

	private SciBooksDTO sciBooksDTO;

	private SciCartDTO sciCartDTO;
//
//	@NumberFormat(style = Style.NUMBER)
//    private double price;

	@Column(nullable = false)
	@NumberFormat(style = Style.NUMBER)
	private int quantity;

	public SciBooksDTO getSciBooksDTO() {
		return sciBooksDTO;
	}

	public void setSciBooksDTO(SciBooksDTO sciBooksDTO) {
		this.sciBooksDTO = sciBooksDTO;
	}

	public SciCartDTO getSciCartDTO() {
		return sciCartDTO;
	}

	public void setSciCartDTO(SciCartDTO sciCartDTO) {
		this.sciCartDTO = sciCartDTO;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
