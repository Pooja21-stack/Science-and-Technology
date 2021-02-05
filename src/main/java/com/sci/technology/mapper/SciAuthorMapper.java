package com.sci.technology.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sci.technology.dto.SciAuthorDTO;
import com.sci.technology.entity.SciAuthor;

@Mapper
public interface SciAuthorMapper {

	SciAuthorDTO toDto(SciAuthor auth);
	SciAuthor fromDto(SciAuthorDTO authdto);
	
	List<SciAuthorDTO> toDtos(List<SciAuthor> sciAuthor);
}
