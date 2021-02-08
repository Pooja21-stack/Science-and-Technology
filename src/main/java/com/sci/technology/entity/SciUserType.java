package com.sci.technology.entity;

import java.util.Collection;
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

import com.sci.technology.dto.SciPaymentDTO;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "sci_user")
@Data
@Builder
public class SciUserType extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sciUserTypeId")
    protected long id;
	
	@Column(nullable = false)
	private String userType;

	@Column(nullable = false)
	private long sciDesignationId;
	
	//one user can of one user type
	 @OneToOne
	 @JoinColumn(name = "sciUserId")
	 private SciUser sciUser;
	
	//one usertype can have multiple privileges
	@OneToMany(mappedBy="userTypePrivilege")
	private Set<SciPrivileges> privileges;
	
	 //one usertype can have one designation
	 @OneToOne(mappedBy = "sciUserType", cascade = CascadeType.ALL)
	 private SciDesignation sciDesignation;

	public void setPrivileges(Collection<SciPrivileges> privileges2) {
		// TODO Auto-generated method stub

	}
}
