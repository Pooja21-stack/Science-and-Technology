package com.sci.technology.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.validation.constraints.Digits;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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

	public SciUserDTO getSciUserDTO() {
		return sciUserDTO;
	}

	public void setSciUserDTO(SciUserDTO sciUserDTO) {
		this.sciUserDTO = sciUserDTO;
	}

	public SciPaymentDTO getSciPaymentDTO() {
		return sciPaymentDTO;
	}

	public void setSciPaymentDTO(SciPaymentDTO sciPaymentDTO) {
		this.sciPaymentDTO = sciPaymentDTO;
	}

	public String getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public SciTransactionDTO getSciTransactionDTO() {
		return sciTransactionDTO;
	}

	public void setSciTransactionDTO(SciTransactionDTO sciTransactionDTO) {
		this.sciTransactionDTO = sciTransactionDTO;
	}

	public SciCartDTO getSciCartDTO() {
		return sciCartDTO;
	}

	public void setSciCartDTO(SciCartDTO sciCartDTO) {
		this.sciCartDTO = sciCartDTO;
	}

	public Set<SciOrderItemDTO> getSciOrderItemDTO() {
		return sciOrderItemDTO;
	}

	public void setSciOrderItemDTO(Set<SciOrderItemDTO> sciOrderItemDTO) {
		this.sciOrderItemDTO = sciOrderItemDTO;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

}
