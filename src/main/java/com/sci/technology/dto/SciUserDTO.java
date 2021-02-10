package com.sci.technology.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
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

	// private json privileges;

}
