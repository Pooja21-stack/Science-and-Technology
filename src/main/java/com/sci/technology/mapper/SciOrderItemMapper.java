package com.sci.technology.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sci.technology.dto.SciOrderItemDTO;
import com.sci.technology.entity.SciOrderItem;

@Mapper
public interface SciOrderItemMapper {
	
	SciOrderItemDTO toDto(SciOrderItem sciOrderItem);
	SciOrderItem fromDto(SciOrderItemDTO sciOrderItemDTO);
	
	List<SciOrderItemDTO> toDtos(List<SciOrderItem> sciOrderItem);

}
