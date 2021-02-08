package com.sci.technology.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="sci_author")
@Data
@Builder
public class SciAuthor extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "sciAuthorId")
    protected long id;
	
	@Column(name = "name",nullable = false)
    private String name;
	
	@Column(name = "image")
	private String image;
	
	//one author can write multiple books
	@OneToMany(mappedBy="sciAuthor")
	private Set<SciBooks> sciBooks;
    
   
}