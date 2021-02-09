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
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sci_categories")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SciCategories extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "description", nullable = false)
	private String description;

	// one categories can have multiple booksCategories.
	@OneToMany(mappedBy = "sciCategories")
	private Set<SciBooksCategories> sciBooksCategories;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<SciBooksCategories> getSciBooksCategories() {
		return sciBooksCategories;
	}

	public void setSciBooksCategories(Set<SciBooksCategories> sciBooksCategories) {
		this.sciBooksCategories = sciBooksCategories;
	}

}
