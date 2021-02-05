package com.sci.technology.entity;

import java.util.Date;

import javax.persistence.Column;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BaseEntity {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//    protected long id;

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
    protected boolean isActive = true;
	    
}
