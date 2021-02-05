package com.sci.technology.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.*;

@Entity
@Table(name="sci_author")
public class SciAuthor extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Getter
	@Setter
	@Column(nullable = false)
    private String name;
	
	//one author can write multiple books
   @OneToMany(mappedBy="author")
	private Set<SciBooks> books;
    
   
}