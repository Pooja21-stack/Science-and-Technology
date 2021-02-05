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
    protected long id;
	
	@Column(nullable = false)
    private long sciUserId;
	
    private long sciPaymentId;

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
    
    private long sci_transaction_id;
   
   	@Column(nullable = false)
    private long contact;
    
    //one order can have multiple order_items
    @OneToMany(mappedBy="order")
	private Set<SciOrderItem> orderItem;
    
    //one user can have multiple orders.
    @ManyToOne
    @JoinColumn(name="id", nullable=false)
    private SciUser user;
    
    //one cart can have one order
    @OneToOne(mappedBy = "order")
    private SciCart cart;
    
    //one order can have one payment
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "id", referencedColumnName = "id")
	 private SciPayment payment;
    
}
