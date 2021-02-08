package com.sci.technology.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Builder;
import lombok.Data;


@Entity
@Table(name = "sci_user",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
@Data
@Builder
public class SciUser extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    protected long id;
	

	@Column(name = "first_name",nullable = false)
	private String firstName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "last_name",nullable = false)
	private String lastName;
	
	@Column(name = "contact",nullable = false)
	private long contact;
	
	@Column(name = "contact2")
	private long contact2;
	
	@Column(name = "email",nullable = false)
	private String email;
	
	@Column(name = "password",nullable = false)
	private String password;
	
	@Column(name = "address",nullable = false)
	private String address;
	
	@Column(name = "image")
	private String image;
	
	
	//one user can have multiple orders.
	@OneToMany(mappedBy="sciUser")
	private Set<SciOrder> sciOrder;
	
	//one user can give multiple books reviews
	@OneToMany(mappedBy="sciUser")
	private Set<SciBooksReview> sciBooksReview;
	
	//one user can of one user type
	@OneToOne(mappedBy = "sciUser", cascade = CascadeType.ALL)
	 private SciUserType sciUserType;
	//private json privileges;
	
	//one user can have one cart only.
	@OneToOne(mappedBy = "sciUser", cascade = CascadeType.ALL)
    private SciCart sciCart;
	
	//one user have multiple privileges
	 @OneToMany(mappedBy = "sciUser")
	 private Set<SciPrivileges> sciPrivileges;

	//one user have multiple transactions
	 @OneToMany(mappedBy = "sciUser")
	 private Set<SciTransaction> sciTransaction;

	 //one user can have one designation
	 @OneToOne(mappedBy = "sciUser", cascade = CascadeType.ALL)
	 private SciDesignation sciDesignation;
}
