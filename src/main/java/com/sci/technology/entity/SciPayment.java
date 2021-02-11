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
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sci_payment")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
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

}
