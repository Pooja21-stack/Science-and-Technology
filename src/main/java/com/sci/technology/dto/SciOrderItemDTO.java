package com.sci.technology.dto;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
public class SciOrderItemDTO extends BaseEntityDTO{
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
    private SciOrderDTO order;
    
    //one order_item can have one book.
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
	private SciBooksDTO books;
    
}
