package com.sci.technology.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sci_cart")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SciCart extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;

	@Column(name = "status")
	private String status;

	public enum status{
	pending, inProgress, complete;
	}

	// one cart can contain multiple cart items
	@OneToMany(mappedBy = "sciCart")
	private Set<SciCartItem> sciCartItem;

	// one cart can have one order
	@OneToOne
	@JoinColumn(name = "id")
	private SciOrder sciOrder;

	// one user can have one cart only.
	@OneToOne
	@JoinColumn(name = "id")
	private SciUser sciUser;
}
