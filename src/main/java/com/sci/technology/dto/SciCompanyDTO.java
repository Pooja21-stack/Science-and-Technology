package com.sci.technology.dto;

import javax.persistence.Column;
import lombok.Data;

@Data
public class SciCompanyDTO extends BaseEntityDTO {
	private String profile;
	private String about;
	
	
}
