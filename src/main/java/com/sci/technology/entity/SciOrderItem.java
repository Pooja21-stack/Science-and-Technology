package com.sci.technology.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
@Entity
@Table(name = "sci_order_item")
@Data
public class SciOrderItem extends BaseEntity{
	@Column(nullable = false)
    private long sciOrderId;
  
	@Column(nullable = false)
    private String sku;
 
	@Column(nullable = false)
    private long sciBooksId;
   
	@Column(nullable = false)
    private int quantity;
   
	@Column(nullable = false)
    private String content;
    
    //one order can have multiple order_items
    @ManyToOne
    @JoinColumn(name="id", nullable=false)
    private SciOrder order;
    
  //one order_item can have one book.
    @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "id", referencedColumnName = "id")
	 private SciBooks books;
}
