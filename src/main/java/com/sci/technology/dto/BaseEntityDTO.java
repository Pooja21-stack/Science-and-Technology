package com.sci.technology.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

@Data
public class BaseEntityDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
	
	@CreatedDate
	@Column(nullable = false)
	protected Date createdDate;
	    
    @LastModifiedDate
	@Column(nullable = false)
    protected Date modifiedDate;
	    
    @CreatedBy
	@Column(nullable = false)
    protected String createdBy;
	    
    @LastModifiedBy
	@Column(nullable = false)
    protected String modifiedBy;
	    
    @Column(nullable = false)
    protected boolean isActive;
}
