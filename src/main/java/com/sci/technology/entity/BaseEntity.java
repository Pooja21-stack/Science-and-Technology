package com.sci.technology.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

	@CreatedDate
	@Column(nullable = false)
	private Date createdDate;
	    
    @LastModifiedDate
	@Column(nullable = false)
    private Date modifiedDate;
	    
    @CreatedBy
	@Column(nullable = false)
    private String createdBy;
	    
    @LastModifiedBy
	@Column(nullable = false)
	private String modifiedBy;
	    
    @Column(nullable = false)
    private boolean isActive;
	    
}
