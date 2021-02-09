package com.sci.technology.mapper;

import org.mapstruct.Mapper;

import com.sci.technology.dto.SciCompanyDTO;
import com.sci.technology.entity.SciCompany;

@Mapper(componentModel = "spring")
public interface SciCompanyMapper {

	SciCompanyDTO toDto(SciCompany sciCompany);

	SciCompany fromDto(SciCompanyDTO sciCompanyDTO);

}
