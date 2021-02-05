package com.sci.technology.mapper;

import org.mapstruct.Mapper;

import com.sci.technology.dto.SciUserTypeDTO;
import com.sci.technology.entity.SciUserType;

@Mapper
public interface SciUserTypeMapper {
	SciUserTypeDTO toDto(SciUserType sciUserType);
	SciUserType fromDto(SciUserTypeDTO sciUserTypeDTO);

}
