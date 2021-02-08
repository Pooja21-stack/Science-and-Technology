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

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "sci_cart")
@Data
@Builder
public class SciCart extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sciCartId")
    protected long id;
	enum status{
		pending, complete, inProgress;
	}
//	
//	@Column(nullable = false)
//    private long sciUserId;
	
	//one cart can contain multiple cart items
	@OneToMany(mappedBy="sciCart")
	private Set<SciCartItem> sciCartItem;
	
	 //one cart can have one order
	 @OneToOne
	 @JoinColumn(name = "sciOrderId")
	 private SciOrder sciOrder;
	 
	//one user can have one cart only.
	 @OneToOne
	 @JoinColumn(name = "sciUserId")
	 private SciUser sciUser;
	 
	 
}
