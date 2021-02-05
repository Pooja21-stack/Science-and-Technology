package com.sci.technology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "sci_privileges")
@Data
@Builder
public class SciPrivileges extends BaseEntity {
	@Column(nullable = false)
	private long sciUserId;
	
	@Column(nullable = false)
	private String role;
	
	
}
