package com.sci.technology.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sci_books_categories")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SciBooksCategories extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;

	@Column(name = "name", nullable = false)
	private String name;

	// one categories can have multiple booksCategories.
	@ManyToOne
	@JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
	private SciCategories sciCategories;

	// one book_categories can have multiple books.
	@OneToMany(mappedBy = "sciBooksCategories")
	private Set<SciBooks> sciBooks;

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

	public SciCategories getSciCategories() {
		return sciCategories;
	}

	public void setSciCategories(SciCategories sciCategories) {
		this.sciCategories = sciCategories;
	}

	public Set<SciBooks> getSciBooks() {
		return sciBooks;
	}

	public void setSciBooks(Set<SciBooks> sciBooks) {
		this.sciBooks = sciBooks;
	}

}