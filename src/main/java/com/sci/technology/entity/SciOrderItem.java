package com.sci.technology.entity;

import javax.persistence.CascadeType;
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
@Table(name = "sci_order_item")
@Data
@Builder
public class SciOrderItem extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    protected long id;
	
  
	@Column(name = "quantity",nullable = false)
    private int quantity;
    
    //one order can have multiple order_items
    @ManyToOne
    @JoinColumn(name="id", nullable=false,insertable = false, updatable= false)
    private SciOrder sciOrder;
    
  //one order_item can have one book.
    @OneToOne(mappedBy="sciOrderItem",cascade = CascadeType.ALL)
	 private SciBooks sciBooks;
}
