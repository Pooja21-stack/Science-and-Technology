package com.sci.technology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sci_transaction")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SciTransaction extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;

	@Column(name = "content", nullable = false)
	private String content;

//	enum status{
//		pending, complete, inProgress;
//	}

	// one payment can have one transaction
	@OneToOne
	@JoinColumn(name = "id")
	private SciPayment sciPayment;

	// one order can have one transaction
	@OneToOne
	@JoinColumn(name = "id")
	private SciOrder sciOrder;

	// one user have multiple transactions
	@ManyToOne
	@JoinColumn(name = "id", insertable = false, updatable = false)
	private SciUser sciUser;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public SciPayment getSciPayment() {
		return sciPayment;
	}

	public void setSciPayment(SciPayment sciPayment) {
		this.sciPayment = sciPayment;
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
