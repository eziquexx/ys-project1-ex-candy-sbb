package com.ys.project1.ex.sbb.candy;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper {
	Message getMessageById(Integer id);
	List<Message> getMessageList();
}
