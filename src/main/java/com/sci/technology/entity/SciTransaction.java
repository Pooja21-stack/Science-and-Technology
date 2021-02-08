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

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "sci_transaction")
@Data
@Builder
public class SciTransaction extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sciTransactionId")
    protected long id;
	
	@Column(nullable = false)
	private String content;
	
//	@Column(nullable = false)
//	private long sciUserId;

//	@Column(nullable = false)
//	private long sciOrderId;

//	@Column(nullable = false)
//	private long sciPaymentId;
	
	enum status{
		pending, complete, inProgress;
	}
	
	//one payment can have one transaction
    @OneToOne
    @JoinColumn(name = "sciPaymentId")
    private SciPayment sciPayment;
    
    
    //one order can have one transaction
    @OneToOne
    @JoinColumn(name = "sciOrderId")
    private SciOrder sciOrder;
    
    //one user have multiple transactions 
    @ManyToOne
    @JoinColumn(name = "sciUserId")
    private SciUser sciUser;
    
	
}
