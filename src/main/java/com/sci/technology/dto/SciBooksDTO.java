package com.sci.technology.dto;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SciBooksDTO extends BaseEntityDTO {
	@Column(nullable = false)
	@Pattern(regexp = "^[A-Za-z]*$", message = "Invalid Input")
	private String title;

	@Column(nullable = false)
	private String description;

	@Column(nullable = false)
	private String sku;

	@Column(nullable = false)
	@NumberFormat(style = Style.NUMBER)
	private double price;

	@Column(nullable = false)
	private boolean isAvailable;

	@Column(nullable = false)
	@NumberFormat(style = Style.NUMBER)
	private int quantity;

	@Column(nullable = false)
	// @JsonFormat(pattern="yyyy-MM-dd")
	private Date publishingDate;

	@Column(nullable = false)
	private String image;

	private SciAuthorDTO sciAuthorDTO;

	private Set<SciBooksReviewDTO> sciBooksReviewDTO;
//	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getPublishingDate() {
		return publishingDate;
	}

	public void setPublishingDate(Date publishingDate) {
		this.publishingDate = publishingDate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public SciAuthorDTO getSciAuthorDTO() {
		return sciAuthorDTO;
	}

	public void setSciAuthorDTO(SciAuthorDTO sciAuthorDTO) {
		this.sciAuthorDTO = sciAuthorDTO;
	}

	public Set<SciBooksReviewDTO> getSciBooksReviewDTO() {
		return sciBooksReviewDTO;
	}

	public void setSciBooksReviewDTO(Set<SciBooksReviewDTO> sciBooksReviewDTO) {
		this.sciBooksReviewDTO = sciBooksReviewDTO;
	}

}
