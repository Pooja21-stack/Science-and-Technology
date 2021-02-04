package com.sci.technology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "sci_user")
@Data
public class SciUserType extends BaseEntity {
	@Column(nullable = false)
	private String userType;

	@Column(nullable = false)
	private long sciDesignationId;
}
