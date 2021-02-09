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
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sci_cart")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SciCart extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;

//	@Column(name = "status")

	@Column(name = "status")
	private String status;
//	enum status{
//		pending, complete, inProgress;
//	}

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<SciCartItem> getSciCartItem() {
		return sciCartItem;
	}

	public void setSciCartItem(Set<SciCartItem> sciCartItem) {
		this.sciCartItem = sciCartItem;
	}

	public SciOrder getSciOrder() {
		return sciOrder;
	}

	public void setSciOrder(SciOrder sciOrder) {
		this.sciOrder = sciOrder;
	}

	public SciUser getSciUser() {
		return sciUser;
	}

	public void setSciUser(SciUser sciUser) {
		this.sciUser = sciUser;
	}

}
