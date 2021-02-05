package com.sci.technology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "sci_user")
@Data
@Builder
public class SciUserType extends BaseEntity {
	@Column(nullable = false)
	private String userType;

	@Column(nullable = false)
	private long sciDesignationId;
}
