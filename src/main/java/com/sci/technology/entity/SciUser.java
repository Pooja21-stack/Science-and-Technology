package com.sci.technology.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;


@Entity
@Table(name = "sci_user")
@Data
@Builder
public class SciUser extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
	
	@Column(nullable = false)
	private String firstName;
	
	private String middleName;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private long contact;
	
	private long contact2;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String address;
	
	private String image;

	@ManyToOne
	@JoinColumn(name="sci_user_type_id", nullable=false)
	private SciUserType sciUserType;
	
/*	@Column(nullable = false)
	private long sciDesignationId;*/
	
	//one user can have multiple orders.
	@OneToMany(mappedBy="userOrder")
	private Set<SciOrder> order;
	
	//one user can give multiple books reviews
	@OneToMany(mappedBy="userBooksReview")
	private Set<SciBooksReview> booksReview;
	
	
	//private json privileges;
	
	
}
