package com.sci.technology.entity;

import java.util.Date;

public class SciOrder {
    private long id;
    private long sciUserId;
    private long sciPaymentId;
    private Date createdDate;
    private Date modifiedDate;
    private String createdBy;
    private String modifiedBy;
    private boolean isActive;
    private String address;
    private String status;
    private double total;
}
