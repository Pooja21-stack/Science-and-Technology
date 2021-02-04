package com.sci.technology.dto;

import lombok.Data;

@Data
public class SciPaymentDTO extends BaseEntityDTO {
    private String type;
    private double amount;
    private String mode;
    enum status{
		pending, complete, inProgress;
	}
	
  
}
