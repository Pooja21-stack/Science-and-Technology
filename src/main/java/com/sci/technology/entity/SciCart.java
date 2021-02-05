package com.sci.technology.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "sci_cart")
@Data
@Builder
public class SciCart extends BaseEntity {
	enum status{
		pending, complete, inProgress;
	}
	
	@Column(nullable = false)
    private long sciUserId;
	
	//one cart can contain multiple cart items
	@OneToMany(mappedBy="cart")
	private Set<SciCartItem> items;
	
	 //one cart can have one order
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "id", referencedColumnName = "id")
	 private SciOrder order;
}
