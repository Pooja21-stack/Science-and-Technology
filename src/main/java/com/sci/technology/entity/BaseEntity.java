package com.sci.technology.entity;

import java.util.Date;

import javax.persistence.Column;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

@Data
public class BaseEntity {
	
	@CreatedDate
	@Column(name = "created_date",nullable = false)
	protected Date createdDate;
	    
    @LastModifiedDate
    @Column(name = "modified_date",nullable = false)
    protected Date modifiedDate;
	
	@CreatedBy
	@Column(name = "created_by",nullable = false)
    protected String createdBy;
	    
    @LastModifiedBy
    @Column(name = "modified_by",nullable = false)
    protected String modifiedBy;
	   
    @Column(name = "is_active",nullable = false)
    protected boolean isActive = true;
	    
}
