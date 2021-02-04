package com.sci.technology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name = "sci_designation")
@Data
public class SciDesignation extends BaseEntity {
	@Column(nullable = false)
	private String type;
	
	
}
