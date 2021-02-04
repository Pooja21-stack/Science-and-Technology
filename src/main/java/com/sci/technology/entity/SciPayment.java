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

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "sci_payment")
public class SciPayment extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	  
    @Getter
	@Setter
	@Column(nullable = false)
    private String type;
    
    @Getter
	@Setter
	@Column(nullable = false)
    private double amount;
    
    
    @Getter
	@Setter
	@Column(nullable = false)
    private String mode;
    
    
    @Getter
	@Setter
	@Column(nullable = false)
    private String status;
    
  //one order can have one payment
    @OneToOne(mappedBy = "payment")
    private SciOrder order;
    
    //one payment can have one transaction
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "id", referencedColumnName = "id")
	 private SciTransaction transaction;
    
}
