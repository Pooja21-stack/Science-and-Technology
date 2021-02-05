package com.sci.technology.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class BaseEntityDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
}
