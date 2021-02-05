package com.sci.technology.dto;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
public class SciUserDTO extends BaseEntityDTO {
	
	@Column(nullable = false)
	private String firstName;
	
	private String middleName;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private long contact;
	
	private long contact2;
	
	@Column(nullable = false)
//	@Email(message = "Please provide a valid Email")
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String address;
	
	private String image;
	
	@Column(nullable = false)
	private long sciUserTypeId;
	
	@Column(nullable = false)
	private long sciDesignationId;
	
	//one user can have multiple orders.
	@OneToMany(mappedBy="userOrder")
	private Set<SciOrderDTO> order;
	
	//one user can give multiple books reviews
	@OneToMany(mappedBy="userBooksReview")
	private Set<SciBooksReviewDTO> booksReview;
	
	//private json privileges;
	
	
}
