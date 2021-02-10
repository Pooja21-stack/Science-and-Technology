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
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sci_order")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SciOrder extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;

	@Column(name = "delivery_address", nullable = false)
	private String delivery_address;

	enum status {
		pending, complete, inProgress;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getRecieptPath() {
		return recieptPath;
	}

	public void setRecieptPath(double recieptPath) {
		this.recieptPath = recieptPath;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public Set<SciOrderItem> getSciOrderItem() {
		return sciOrderItem;
	}

	public void setSciOrderItem(Set<SciOrderItem> sciOrderItem) {
		this.sciOrderItem = sciOrderItem;
	}

	public SciUser getSciUser() {
		return sciUser;
	}

	public void setSciUser(SciUser sciUser) {
		this.sciUser = sciUser;
	}

	public SciCart getSciCart() {
		return sciCart;
	}

	public void setSciCart(SciCart sciCart) {
		this.sciCart = sciCart;
	}

	public SciPayment getSciPayment() {
		return sciPayment;
	}

	public void setSciPayment(SciPayment sciPayment) {
		this.sciPayment = sciPayment;
	}

	public SciTransaction getSciTransaction() {
		return sciTransaction;
	}

	public void setSciTransaction(SciTransaction sciTransaction) {
		this.sciTransaction = sciTransaction;
	}

}
