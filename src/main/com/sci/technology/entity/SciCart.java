package com.sci.technology.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "sci_cart")
public class SciCart extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Getter
	@Setter
	@Column(nullable = false)
    private long sciUserId;
	
	@Getter
	@Setter
	@Column(nullable = false)
    private String status;
	
	//one cart can contain multiple cart items
	@OneToMany(mappedBy="cart")
	private Set<SciCartItem> items;
	
	 //one cart can have one order
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "id", referencedColumnName = "id")
	 private SciOrder order;
}
