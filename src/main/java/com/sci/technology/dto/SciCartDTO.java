package com.sci.technology.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;


@Data
public class SciCartDTO extends BaseEntityDTO {
	@Column(nullable = false)
    private long sciUserId;
	
	//one cart can contain multiple cart items
	@OneToMany(mappedBy="cart")
	private Set<SciCartItemDTO> items;
	
	 //one cart can have one order
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "id", referencedColumnName = "id")
	 private SciOrderDTO order;
}
