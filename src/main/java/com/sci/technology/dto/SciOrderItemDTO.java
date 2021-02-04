package com.sci.technology.dto;
import lombok.Data;

@Data
public class SciOrderItemDTO extends BaseEntityDTO{
    private long sciOrderId;
 
    private String sku;
 
    private long sciBooksId;
  
    private int quantity;
  
    private String content;
    
}
