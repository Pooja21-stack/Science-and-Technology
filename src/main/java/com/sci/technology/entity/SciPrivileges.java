package com.sci.technology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "sci_privileges")
@Data
@Builder
public class SciPrivileges extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    protected long id;
	
//	@Column(nullable = false)
//	private long sciUserId;
	
	@Column(name = "role",nullable = false)
	private String role;
	
	//one usertype can have multiple privileges
	@ManyToOne
    @JoinColumn(name="id", nullable=false,insertable = false, updatable= false)
    private SciUserType sciUserType;
	
	 @ManyToOne
	 @JoinColumn(name = "id",insertable = false, updatable= false)
	 private SciUser sciUser;
	
	
}
