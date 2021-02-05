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

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "sci_order_item")
public class SciOrderItem extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Getter
	@Setter
	@Column(nullable = false)
    private long sciOrderId;
    
    @Getter
	@Setter
	@Column(nullable = false)
    private String sku;
    
    @Getter
	@Setter
	@Column(nullable = false)
    private long sciBooksId;
    
    @Getter
	@Setter
	@Column(nullable = false)
    private int quantity;
    
    @Getter
	@Setter
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
