package com.sci.technology.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sci.technology.dto.SciTransactionDTO;
import com.sci.technology.entity.SciTransaction;

@Mapper
public interface SciTransactionMapper {
	SciTransactionDTO toDto(SciTransaction sciTransaction);
	SciTransaction fromDto(SciTransactionDTO sciTransactionDTO);

	List<SciTransactionDTO> toDtos(List<SciTransaction> sciTransaction);

}
