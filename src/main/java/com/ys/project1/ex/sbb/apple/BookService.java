package com.ys.project1.ex.sbb.apple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ys.project1.ex.sbb.apple.DTO.BookDTO;


@Service
public class BookService {
	@Autowired
	private BookMapper mapper;
	
	public BookDTO getBook(int id) {
		return mapper.getBook(id);
	}
}
