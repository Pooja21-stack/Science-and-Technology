package com.sci.technology.dto;
import javax.persistence.Column;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
public class SciTransactionDTO extends BaseEntityDTO {
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
    private SciPaymentDTO payment;
	
}
