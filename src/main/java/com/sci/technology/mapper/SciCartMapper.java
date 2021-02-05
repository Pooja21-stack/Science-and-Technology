package com.sci.technology.mapper;

import org.mapstruct.Mapper;

import com.sci.technology.dto.SciCartDTO;
import com.sci.technology.entity.SciCart;

@Mapper
public interface SciCartMapper {
	SciCartDTO toDto(SciCart sciCart);
	SciCart fromDto(SciCartDTO sciCartDTO);

}
