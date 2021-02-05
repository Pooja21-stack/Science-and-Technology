package com.sci.technology.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sci.technology.dto.SciBooksReviewDTO;
import com.sci.technology.entity.SciBooksReview;

@Mapper
public interface SciBooksReviewMapper {
	SciBooksReviewDTO toDto(SciBooksReview sciBooksReview);
	SciBooksReview fromDto(SciBooksReviewDTO sciBooksReviewDTO);
	
	List<SciBooksReviewDTO> toDtos(List<SciBooksReview> sciBooksReview);

}
