package com.sci.technology.dto;
import javax.persistence.Column;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.Data;

@Data
public class SciOrderItemDTO extends BaseEntityDTO{
    private SciOrderDTO sciOrderDTO;
   
	@Column(nullable = false)
	@NumberFormat(style = Style.NUMBER)
    private int quantity;
    
    private SciBooksDTO sciBooksDTO;
    
}
