package com.sci.technology.dto;
import lombok.Data;

@Data
public class SciTransactionDTO extends BaseEntityDTO {
	private String content;
	
	private long sciUserId;

	private long sciOrderId;
	
	private long sciPaymentId;
	
}
