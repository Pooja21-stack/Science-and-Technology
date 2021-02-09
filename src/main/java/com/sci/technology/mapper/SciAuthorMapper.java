package com.sci.technology.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import com.sci.technology.dto.SciAuthorDTO;
import com.sci.technology.entity.SciAuthor;

@Mapper(componentModel = "spring")
public interface SciAuthorMapper {

	SciAuthorDTO toDto(SciAuthor sciAuthor);

	SciAuthor fromDto(SciAuthorDTO sciAuthorDTO);

	List<SciAuthorDTO> toDtos(List<SciAuthor> sciAuthor);
}
