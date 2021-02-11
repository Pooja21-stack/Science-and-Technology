package com.sci.technology.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sci.technology.dto.BaseEntityDTO;
import com.sci.technology.entity.BaseEntity;

@Mapper(componentModel = "spring")
public interface BaseEntityMapper{
	
	BaseEntityDTO toDto(BaseEntity baseEntity);
	BaseEntity fromDto(BaseEntityDTO baseEntityDTO);
	List<BaseEntityDTO> toDtos(List<BaseEntity> baseEntity);
}