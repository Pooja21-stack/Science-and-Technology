package com.sci.technology.dto;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;

@Data
public class SciOrderDTO extends BaseEntityDTO {
    private long sciUserId;
    private long sciPaymentId;
    private String delivery_address;
    enum status{
		pending, complete, inProgress;
	}
	
    private double total;
    private double latitude;
    private double longitude;
    private long sci_transaction_id;
    private long contact;
    
   
    
}
