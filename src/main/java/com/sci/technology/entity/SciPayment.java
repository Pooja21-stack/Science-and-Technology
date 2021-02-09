package com.sci.technology.entity;

import javax.persistence.CascadeType;
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
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sci_payment")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SciPayment extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;

	@Column(name = "type", nullable = false)
	private String type;

	@Column(name = "amount", nullable = false)
	private double amount;

	@Column(name = "mode", nullable = false)
	private String mode;

	enum status {
		pending, complete, inProgress;
	}

	// one order can have one payment
	@OneToOne
	@JoinColumn(name = "id")
	private SciOrder sciOrder;

	// one payment can have one transaction
	@OneToOne(mappedBy = "sciPayment", cascade = CascadeType.ALL)
	private SciTransaction sciTransaction;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public SciOrder getSciOrder() {
		return sciOrder;
	}

	public void setSciOrder(SciOrder sciOrder) {
		this.sciOrder = sciOrder;
	}

	public SciTransaction getSciTransaction() {
		return sciTransaction;
	}

	public void setSciTransaction(SciTransaction sciTransaction) {
		this.sciTransaction = sciTransaction;
	}

}
