package com.sci.technology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "sci_transaction")
@Data
@Builder
public class SciTransaction extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
	
	@Column(nullable = false)
	private String content;
	
	@Column(nullable = false)
	private long sciUserId;

	@Column(nullable = false)
	private long sciOrderId;

	@Column(nullable = false)
	private long sciPaymentId;
	
	//one payment can have one transaction
    @OneToOne(mappedBy = "transaction")
    private SciPayment payment;
    
	
}
