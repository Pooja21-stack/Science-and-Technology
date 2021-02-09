package com.sci.technology.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class SciUserDTO extends BaseEntityDTO {

	@Column(nullable = false)
	@Pattern(regexp = "^[A-Za-z]*$", message = "Invalid Input")
	private String firstName;

	@Pattern(regexp = "^[A-Za-z]*$", message = "Invalid Input")
	private String middleName;

	@Pattern(regexp = "^[A-Za-z]*$", message = "Invalid Input")
	@Column(nullable = false)
	private String lastName;

	@Column(nullable = false)
	@Digits(integer = 10, fraction = 0)
	private long contact;

	@Digits(integer = 10, fraction = 0)
	private long contact2;

	@Column(nullable = false)
	@Email(message = "Please provide a valid Email")
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Password must contain at least one digit [0-9].
//	Password must contain at least one lowercase Latin character [a-z].
//	Password must contain at least one uppercase Latin character [A-Z].
//	Password must contain at least one special character like ! @ # & ( ).
//	Password must contain a length of at least 8 characters and a maximum of 20 characters.
	@Column(nullable = false)
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", message = "Invalid Input")
	private String password;

	@Column(nullable = false)
	private String address;

	private String image;

	private SciUserTypeDTO sciUserTypeDTO;

	private SciDesignationDTO sciDesignationDTO;

	private Set<SciOrderDTO> sciOrderDTO;

	private Set<SciBooksReviewDTO> setBooksReviewDTO;

	public String getFirstName() {
		return firstName;
	}

	public String getPassword() {
		return password;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public long getContact2() {
		return contact2;
	}

	public void setContact2(long contact2) {
		this.contact2 = contact2;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public SciUserTypeDTO getSciUserTypeDTO() {
		return sciUserTypeDTO;
	}

	public void setSciUserTypeDTO(SciUserTypeDTO sciUserTypeDTO) {
		this.sciUserTypeDTO = sciUserTypeDTO;
	}

	public SciDesignationDTO getSciDesignationDTO() {
		return sciDesignationDTO;
	}

	public void setSciDesignationDTO(SciDesignationDTO sciDesignationDTO) {
		this.sciDesignationDTO = sciDesignationDTO;
	}

	public Set<SciOrderDTO> getSciOrderDTO() {
		return sciOrderDTO;
	}

	public void setSciOrderDTO(Set<SciOrderDTO> sciOrderDTO) {
		this.sciOrderDTO = sciOrderDTO;
	}

	public Set<SciBooksReviewDTO> getSetBooksReviewDTO() {
		return setBooksReviewDTO;
	}

	public void setSetBooksReviewDTO(Set<SciBooksReviewDTO> setBooksReviewDTO) {
		this.setBooksReviewDTO = setBooksReviewDTO;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// private json privileges;

}
