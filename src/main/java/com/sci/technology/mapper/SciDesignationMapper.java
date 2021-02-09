package com.sci.technology.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sci.technology.dto.SciDesignationDTO;
import com.sci.technology.entity.SciDesignation;

@Mapper(componentModel = "spring")
public interface SciDesignationMapper {

	SciDesignationDTO toDto(SciDesignation sciDesignation);

	SciDesignation fromDto(SciDesignationDTO sciDesignationDTO);

	List<SciDesignationDTO> toDtos(List<SciDesignation> sciDesignation);

}
