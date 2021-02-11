package com.sci.technology.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sci.technology.dto.SciBooksCategoriesDTO;
import com.sci.technology.entity.SciBooksCategories;

@Mapper(componentModel = "spring")
public interface SciBooksCategoriesMapper {

	SciBooksCategoriesDTO toDto(SciBooksCategories sciBooksCategories);

	SciBooksCategories fromDto(SciBooksCategoriesDTO sciBooksCategoriesDTO);

	List<SciBooksCategoriesDTO> toDtos(List<SciBooksCategories> sciBooksCategories);
}
