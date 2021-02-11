package com.sci.technology.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sci.technology.dto.SciOrderDTO;
import com.sci.technology.entity.SciOrder;

@Mapper(componentModel = "spring")
public interface SciOrderMapper {

	SciOrderDTO toDto(SciOrder sciOrder);

	SciOrder fromDto(SciOrderDTO sciOrderDTO);

	List<SciOrderDTO> toDtos(List<SciOrder> sciOrder);

}
