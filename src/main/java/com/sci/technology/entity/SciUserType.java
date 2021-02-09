package com.sci.technology.entity;

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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sci_user")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SciUserType extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;

	@Column(name = "user_type", nullable = false)
	private String userType;

	// one user can of one user type
	@OneToOne
	@JoinColumn(name = "id")
	private SciUser sciUser;

	// one usertype can have multiple privileges
	@OneToMany(mappedBy = "sciUserType")
	private Set<SciPrivileges> sciPrivileges;

	// one usertype can have one designation
	@OneToOne(mappedBy = "sciUserType", cascade = CascadeType.ALL)
	private SciDesignation sciDesignation;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public SciUser getSciUser() {
		return sciUser;
	}

	public void setSciUser(SciUser sciUser) {
		this.sciUser = sciUser;
	}

	public Set<SciPrivileges> getSciPrivileges() {
		return sciPrivileges;
	}

	public void setSciPrivileges(Set<SciPrivileges> sciPrivileges) {
		this.sciPrivileges = sciPrivileges;
	}

	public SciDesignation getSciDesignation() {
		return sciDesignation;
	}

	public void setSciDesignation(SciDesignation sciDesignation) {
		this.sciDesignation = sciDesignation;
	}

}
