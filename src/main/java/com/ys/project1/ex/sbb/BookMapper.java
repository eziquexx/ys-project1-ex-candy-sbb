package com.ys.project1.ex.sbb;

import org.apache.ibatis.annotations.Mapper;

import com.ys.project1.ex.sbb.DTO.BookDTO;

@Mapper
public interface BookMapper {
	BookDTO getBook(int id);
}
