package com.sci.technology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sci_privileges")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SciPrivileges extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;

//	@Column(nullable = false)
//	private long sciUserId;

	@Column(name = "role", nullable = false)
	private String role;

	// one usertype can have multiple privileges
	@ManyToOne
	@JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
	private SciUserType sciUserType;

	@ManyToOne
	@JoinColumn(name = "id", insertable = false, updatable = false)
	private SciUser sciUser;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public SciUserType getSciUserType() {
		return sciUserType;
	}

	public void setSciUserType(SciUserType sciUserType) {
		this.sciUserType = sciUserType;
	}

	public SciUser getSciUser() {
		return sciUser;
	}

	public void setSciUser(SciUser sciUser) {
		this.sciUser = sciUser;
	}

}
