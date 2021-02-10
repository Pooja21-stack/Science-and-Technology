package com.sci.technology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name = "sci_books_review")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SciBooksReview extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;

	@Column(name = "title", nullable = false)
	private String title;

	@Column(name = "rating", nullable = false)
	private int rating;

	@Column(name = "description")
	private String description;

	// one user can give multiple books reviews
	@ManyToOne
	@JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
	private SciUser sciUser;

	@ManyToOne
	@JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
	private SciBooks sciBooks;

}
