package com.sci.technology.entity;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "sci_order")
@Data
@Builder
public class SciOrder extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "sciOrderId")
    protected long id;
	
//	@Column(nullable = false)
//    private long sciUserId;
	
//    private long sciPaymentId;

	@Column(nullable = false)
    private String delivery_address;
   
	enum status{
		pending, complete, inProgress;
	}
    
	@Column(nullable = false)
    private double total;
   
   	@Column(nullable = false)
    private double latitude;
   
   	@Column(nullable = false)
    private double longitude;
    
    //private long sci_transaction_id;
   
   	@Column(nullable = false)
    private long contact;
    
    //one order can have multiple order_items
    @OneToMany(mappedBy="sciOrder")
	private Set<SciOrderItem> sciOrderItem;
    
    //one user can have multiple orders.
    @ManyToOne
    @JoinColumn(name="sciUserId", nullable=false)
    private SciUser sciUser;
    
    //one cart can have one order
    @OneToOne(mappedBy = "sciOrder", cascade = CascadeType.ALL)
    private SciCart sciCart;
    
    //one order can have one payment
	 @OneToOne(mappedBy = "sciOrder", cascade = CascadeType.ALL)
	 private SciPayment sciPayment;
	 
	 //one order can have one transaction.
	 @OneToOne(mappedBy = "sciOrder", cascade = CascadeType.ALL)
	 private SciTransaction sciTransaction;
    
}
