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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sci_user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SciUser extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "middle_name")
	private String middleName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "contact", nullable = false)
	private long contact;

	@Column(name = "contact2")
	private long contact2;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "address", nullable = false)
	private String address;

	@Column(name = "image")
	private String image;

	// one user can have multiple orders.
	@OneToMany(mappedBy = "sciUser")
	private Set<SciOrder> sciOrder;

	// one user can give multiple books reviews
	@OneToMany(mappedBy = "sciUser")
	private Set<SciBooksReview> sciBooksReview;

	// one user can of one user type
	@OneToOne(mappedBy = "sciUser", cascade = CascadeType.ALL)
	private SciUserType sciUserType;
	// private json privileges;

	// one user can have one cart only.
	@OneToOne(mappedBy = "sciUser", cascade = CascadeType.ALL)
	private SciCart sciCart;

	// one user have multiple privileges
	@OneToMany(mappedBy = "sciUser")
	private Set<SciPrivileges> sciPrivileges;

	// one user have multiple transactions
	@OneToMany(mappedBy = "sciUser")
	private Set<SciTransaction> sciTransaction;

	// one user can have one designation
	@OneToOne(mappedBy = "sciUser", cascade = CascadeType.ALL)
	private SciDesignation sciDesignation;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Set<SciOrder> getSciOrder() {
		return sciOrder;
	}

	public void setSciOrder(Set<SciOrder> sciOrder) {
		this.sciOrder = sciOrder;
	}

	public Set<SciBooksReview> getSciBooksReview() {
		return sciBooksReview;
	}

	public void setSciBooksReview(Set<SciBooksReview> sciBooksReview) {
		this.sciBooksReview = sciBooksReview;
	}

	public SciUserType getSciUserType() {
		return sciUserType;
	}

	public void setSciUserType(SciUserType sciUserType) {
		this.sciUserType = sciUserType;
	}

	public SciCart getSciCart() {
		return sciCart;
	}

	public void setSciCart(SciCart sciCart) {
		this.sciCart = sciCart;
	}

	public Set<SciPrivileges> getSciPrivileges() {
		return sciPrivileges;
	}

	public void setSciPrivileges(Set<SciPrivileges> sciPrivileges) {
		this.sciPrivileges = sciPrivileges;
	}

	public Set<SciTransaction> getSciTransaction() {
		return sciTransaction;
	}

	public void setSciTransaction(Set<SciTransaction> sciTransaction) {
		this.sciTransaction = sciTransaction;
	}

	public SciDesignation getSciDesignation() {
		return sciDesignation;
	}

	public void setSciDesignation(SciDesignation sciDesignation) {
		this.sciDesignation = sciDesignation;
	}
}
