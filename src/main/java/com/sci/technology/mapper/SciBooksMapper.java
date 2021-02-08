package com.sci.technology.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sci.technology.dto.SciBooksDTO;
import com.sci.technology.entity.SciBook;



@Mapper
public interface SciBooksMapper {
	
	SciBooksDTO toDto(SciBook scibooks);
	SciBook fromDto(SciBooksDTO scibooksdto);
	List<SciBooksDTO>  toDtos(List<SciBook> sciBooks);

}
