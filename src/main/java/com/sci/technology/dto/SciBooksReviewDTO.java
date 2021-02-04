package com.sci.technology.dto;

import lombok.Data;
@Data
public class SciBooksReviewDTO extends BaseEntityDTO {
    private long sciBooksId;
	
    private long sciUserId;
	
    private String title;
	
    private int rating;
	
    private String description;
	
}
