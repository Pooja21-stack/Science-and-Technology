package com.sci.technology.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sci.technology.dto.SciUserDTO;
import com.sci.technology.entity.SciUser;

@Mapper(componentModel = "spring")
public interface SciUserMapper {

	SciUserDTO toDto(SciUser sciUser);

	SciUser fromDto(SciUserDTO sciUserDTO);

	List<SciUserDTO> toDtos(List<SciUser> sciUser);

}
