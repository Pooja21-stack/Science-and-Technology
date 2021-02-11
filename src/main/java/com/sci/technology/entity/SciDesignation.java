package com.sci.technology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sci_designation")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SciDesignation extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;

	@Column(name = "type", nullable = false)
	private String type;

	// one user can have one designation
	@OneToOne
	@JoinColumn(name = "id")
	private SciUser sciUser;

	// one usertype can have one designation
	@OneToOne
	@JoinColumn(name = "id")
	private SciUserType sciUserType;

}
