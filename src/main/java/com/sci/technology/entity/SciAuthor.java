package com.sci.technology.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="sci_author")
@Data
@Builder
public class SciAuthor extends BaseEntity{
	

	@Column(nullable = false)
    private String name;
	
	private String image;
	
	//one author can write multiple books
	@OneToMany(mappedBy="author")
	private Set<SciBooks> books;
    
   
}