package com.sci.technology.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sci.technology.dto.SciBooksDTO;
import com.sci.technology.entity.SciBooks;

@Mapper(componentModel = "spring")
public interface SciBooksMapper {

	SciBooksDTO toDto(SciBooks scibooks);

	SciBooks fromDto(SciBooksDTO scibooksdto);

	List<SciBooksDTO> toDtos(List<SciBooks> sciBooks);

}
