package com.ys.project1.ex.sbb.apple;

import org.apache.ibatis.annotations.Mapper;

import com.ys.project1.ex.sbb.apple.DTO.BookDTO;


@Mapper
public interface BookMapper {
	BookDTO getBook(int id);
}
