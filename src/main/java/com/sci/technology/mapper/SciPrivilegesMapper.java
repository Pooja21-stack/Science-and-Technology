package com.sci.technology.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sci.technology.dto.SciPrivilegesDTO;
import com.sci.technology.entity.SciPrivileges;

@Mapper
public interface SciPrivilegesMapper {
	
	SciPrivilegesDTO toDto(SciPrivileges sciPrivileges);
	SciPrivileges fromDto(SciPrivilegesDTO sciPrivilegesDTO);
	List<SciPrivilegesDTO> toDtos(List<SciPrivileges> sciPrivileges);

}
