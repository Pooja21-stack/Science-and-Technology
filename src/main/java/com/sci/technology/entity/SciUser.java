package com.sci.technology.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	@Column(name = "sciUserId")
    protected long id;
	

	@Column(nullable = false)
	private String firstName;
	
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getMiddleName() {
//		return middleName;
//	}
//
//	public void setMiddleName(String middleName) {
//		this.middleName = middleName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public long getContact() {
//		return contact;
//	}
//
//	public void setContact(long contact) {
//		this.contact = contact;
//	}
//
//	public long getContact2() {
//		return contact2;
//	}
//
//	public void setContact2(long contact2) {
//		this.contact2 = contact2;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getImage() {
//		return image;
//	}
//
//	public void setImage(String image) {
//		this.image = image;
//	}
//
//	public long getSciUserTypeId() {
//		return sciUserTypeId;
//	}
//
//	public void setSciUserTypeId(long sciUserTypeId) {
//		this.sciUserTypeId = sciUserTypeId;
//	}
//
//	public long getSciDesignationId() {
//		return sciDesignationId;
//	}
//
//	public void setSciDesignationId(long sciDesignationId) {
//		this.sciDesignationId = sciDesignationId;
//	}
//
//	public Set<SciOrder> getOrder() {
//		return order;
//	}
//
//	public void setOrder(Set<SciOrder> order) {
//		this.order = order;
//	}
//
//	public Set<SciBooksReview> getBooksReview() {
//		return booksReview;
//	}
//
//	public void setBooksReview(Set<SciBooksReview> booksReview) {
//		this.booksReview = booksReview;
//	}
//
//	public SciUserType getUserType() {
//		return userType;
//	}
//
//	public void setUserType(SciUserType userType) {
//		this.userType = userType;
//	}

	private String middleName;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private long contact;
	
	private long contact2;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String address;
	
	private String image;
	
//	@Column(nullable = false)
//	private long sciUserTypeId;
////	
//	@Column(nullable = false)
//	private long sciDesignationId;
	
	//one user can have multiple orders.
	@OneToMany(mappedBy="sciUserOrder")
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
