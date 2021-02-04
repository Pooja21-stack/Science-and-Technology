package com.sci.technology.dto;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
public class SciCartItemDTO extends BaseEntityDTO {

    private long sciBooksId;
    private long sciCartId;
    private String sku;
    private double price;
    private int quantity;

}
