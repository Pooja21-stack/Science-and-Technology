package com.sci.technology.dto;
import lombok.Data;

@Data
public class SciUserDTO extends BaseEntityDTO {
	
	private String firstName;
	
	private String middleName;

	private String lastName;
	
	private long contact;
	
	private long contact2;
	
	private String email;
	
	private String password;
	
	private String address;
	
	private String image;
	
	private long sciUserTypeId;

	private long sciDesignationId;
	
	
	//private json privileges;
	
	
}
