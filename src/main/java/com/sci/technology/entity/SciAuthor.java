package com.sci.technology.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sci_author")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SciAuthor extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "image")
	private String image;

	// one author can write multiple books
	@OneToMany(mappedBy = "sciAuthor")
	private Set<SciBooks> sciBooks;

}