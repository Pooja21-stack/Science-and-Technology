package com.sci.technology.mapper;

import java.util.List;

import com.sci.technology.dto.SciCartItemDTO;
import com.sci.technology.entity.SciCartItem;

public interface SciCartItemMapper {
	
	SciCartItemDTO toDto(SciCartItem sciCartItem);
	SciCartItem fromDto(SciCartItemDTO sciCartItemDTO);
	
	List<SciCartItemDTO> toDtos(List<SciCartItem> sciCartItem);
	
	}
