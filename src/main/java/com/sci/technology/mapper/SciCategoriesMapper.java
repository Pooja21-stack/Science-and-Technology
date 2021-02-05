package com.sci.technology.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sci.technology.dto.SciCategoriesDTO;
import com.sci.technology.entity.SciCategories;

@Mapper
public interface SciCategoriesMapper {
	
	SciCategoriesDTO toDto(SciCategories sciCategories);
	SciCategories fromDto(SciCategoriesDTO sciCategoriesDTO);
	
	List<SciCategoriesDTO> toDtos(List<SciCategories> sciCategories);
	
}
