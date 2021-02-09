package com.sci.technology.mapper;

import org.mapstruct.Mapper;

import com.sci.technology.dto.SciPaymentDTO;
import com.sci.technology.entity.SciPayment;

@Mapper(componentModel = "spring")
public interface SciPaymentMapper {

	SciPaymentDTO toDto(SciPayment sciPayment);

	SciPayment fromDto(SciPaymentDTO sciPaymentDTO);

}
