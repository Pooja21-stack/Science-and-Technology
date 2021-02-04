package com.sci.technology.dto;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import lombok.Data;

@Data
public class SciBooksDTO extends BaseEntityDTO {
	private String title;

	private String description;
	
	private double price;
	
	private boolean isAvailable;
	
	private int quantity;
	
	private Date publishingDate;
	
	private String image;
	
	//@OneToMany(cascade = CascadeType.ALL)
	private long sciAuthorId;
	
	
}
