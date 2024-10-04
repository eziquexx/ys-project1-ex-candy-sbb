package com.ys.project1.ex.sbb.candy;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper {

	Message getMessageById(Integer id);
}
