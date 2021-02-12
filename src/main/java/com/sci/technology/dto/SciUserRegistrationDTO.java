package com.sci.technology.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SciUserRegistrationDTO {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private long contact;
	private String email;
	private String password;
	private String address;
	private String image;

}
