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

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "sci_payment")
@Data
@Builder
public class SciPayment extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sciPaymentId")
    protected long id;
	
	@Column(nullable = false)
    private String type;
  
	@Column(nullable = false)
    private double amount;
    
	@Column(nullable = false)
    private String mode;
	
	enum status{
		pending, complete, inProgress;
	}
    
    //one order can have one payment
    @OneToOne
    @JoinColumn(name = "sciOrderId")
    private SciOrder order;
    
    //one payment can have one transaction
    @OneToOne(mappedBy = "sciPayment",cascade = CascadeType.ALL)
	private SciTransaction sciTransaction;
    
}
