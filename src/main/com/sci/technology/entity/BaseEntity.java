package com.sci.technology.entity;

import java.util.Date;

import javax.persistence.Column;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.Setter;

public class BaseEntity {

	 @CreatedDate
	    @Getter
		@Setter
		@Column(nullable = false)
	    private Date createdDate;
	    
	    @LastModifiedDate
	    @Getter
		@Setter
		@Column(nullable = false)
	    private Date modifiedDate;
	    
	    @CreatedBy
	    @Getter
		@Setter
		@Column(nullable = false)
	    private String createdBy;
	    
	    @LastModifiedBy
	    @Getter
		@Setter
		@Column(nullable = false)
	    private String modifiedBy;
	    
	    @Getter
		@Setter
		@Column(nullable = false)
	    private boolean isActive;
	    
}
