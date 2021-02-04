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
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "sci_order")
public class SciOrder extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Getter
	@Setter
	@Column(nullable = false)
    private long sciUserId;
	
	@Getter
	@Setter
    private long sciPaymentId;
	
    @Getter
	@Setter
	@Column(nullable = false)
    private String delivery_address;
    
    @Getter
	@Setter
	@Column(nullable = false)
    private String status;
    
    @Getter
	@Setter
	@Column(nullable = false)
    private double total;
    
    @Getter
   	@Setter
   	@Column(nullable = false)
    private double latitude;
    
    @Getter
   	@Setter
   	@Column(nullable = false)
    private double longitude;
    
    @Getter
   	@Setter
    private long sci_transaction_id;
    
    @Getter
   	@Setter
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
