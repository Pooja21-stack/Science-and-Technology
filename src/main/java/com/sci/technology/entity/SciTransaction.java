package com.sci.technology.entity;

import java.sql.Date;

public class SciTransaction {

	private long id;
	private String content;
	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String modifiedBy;
	private boolean isActive;
	private long sciUserId;
	private long sciOrderId;
	private long sciPaymentId;
	
}
