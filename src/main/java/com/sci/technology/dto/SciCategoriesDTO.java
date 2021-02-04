package com.sci.technology.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
public class SciCategoriesDTO extends BaseEntityDTO{
	private String name;
	private String description;
	private long sciCategoriesId;
	
}
