package com.sci.technology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
@Entity
@Table(name = "sci_designation")
@Data
@Builder
public class SciDesignation extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
	
	@Column(nullable = false)
	private String type;
	
	
}
