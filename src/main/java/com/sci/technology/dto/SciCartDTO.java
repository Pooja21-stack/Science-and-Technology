package com.sci.technology.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;


@Data
public class SciCartDTO extends BaseEntityDTO {
	private Set<SciCartItemDTO> sciCartItemDTO;
	
}
