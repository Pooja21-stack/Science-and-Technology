package com.sci.technology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "sci_transaction")
public class SciTransaction extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private String content;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private long sciUserId;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private long sciOrderId;
	
	@Getter
	@Setter
	@Column(nullable = false)
	private long sciPaymentId;
	
	//one payment can have one transaction
    @OneToOne(mappedBy = "transaction")
    private SciPayment payment;
    
	
}
