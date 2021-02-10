package com.sci.technology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sci_designation")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SciDesignation extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;

	@Column(name = "type", nullable = false)
	private String type;

	// one user can have one designation
	@OneToOne
	@JoinColumn(name = "id")
	private SciUser sciUser;

	// one usertype can have one designation
	@OneToOne
	@JoinColumn(name = "id")
	private SciUserType sciUserType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public SciUser getSciUser() {
		return sciUser;
	}

	public void setSciUser(SciUser sciUser) {
		this.sciUser = sciUser;
	}

	public SciUserType getSciUserType() {
		return sciUserType;
	}

	public void setSciUserType(SciUserType sciUserType) {
		this.sciUserType = sciUserType;
	}

}
