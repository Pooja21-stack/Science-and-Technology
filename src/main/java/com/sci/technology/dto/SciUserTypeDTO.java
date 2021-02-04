package com.sci.technology.dto;
import lombok.Data;

@Data
public class SciUserTypeDTO extends BaseEntityDTO {
	private String userType;

	private long sciDesignationId;
}
