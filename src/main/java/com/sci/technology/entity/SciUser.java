package com.sci.technology.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "sci_user")
public class SciUser extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private String firstName;
	
	@Getter
	@Setter
	private String middleName;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private String lastName;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private long contact;
	
	@Getter
	@Setter
	private long contact2;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private String email;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private String password;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private String address;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private long sciUserTypeId;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private long sciDesignationId;
	
	//one user can have multiple orders.
	@OneToMany(mappedBy="userOrder")
	private Set<SciOrder> order;
	
	//one user can give multiple books reviews
	@OneToMany(mappedBy="userBooksReview")
	private Set<SciBooksReview> booksReview;
	
	
	//private json privileges;
	
	
}
