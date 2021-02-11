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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sci_order")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SciOrder extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;

	@Column(name = "delivery_address", nullable = false)
	private String delivery_address;

	public enum status{
		pending, inProgress, complete;
	}

	@Column(name = "total", nullable = false)
	private double total;

	@Column(name = "latitude", nullable = false)
	private double latitude;

	@Column(name = "longitude", nullable = false)
	private double longitude;

	@Column(name = "receipt_path", nullable = false)
	private double recieptPath;

	@Column(name = "contact", nullable = false)
	private long contact;

	// one order can have multiple order_items
	@OneToMany(mappedBy = "sciOrder")
	private Set<SciOrderItem> sciOrderItem;

	// one user can have multiple orders.
	@ManyToOne
	@JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
	private SciUser sciUser;

	// one cart can have one order
	@OneToOne(mappedBy = "sciOrder", cascade = CascadeType.ALL)
	private SciCart sciCart;

	// one order can have one payment
	@OneToOne(mappedBy = "sciOrder", cascade = CascadeType.ALL)
	private SciPayment sciPayment;

	// one order can have one transaction.
	@OneToOne(mappedBy = "sciOrder", cascade = CascadeType.ALL)
	private SciTransaction sciTransaction;

}
