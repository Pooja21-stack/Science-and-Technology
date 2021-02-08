package com.sci.technology.dto;

import java.util.Date;

import javax.persistence.Column;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

@Data
public class BaseEntityDTO {
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
    protected boolean isActive = true;
}
