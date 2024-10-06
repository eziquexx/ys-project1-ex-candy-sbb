package com.ys.project1.ex.sbb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ys.project1.ex.sbb.DTO.BookDTO;

@Controller
@RequestMapping("/book-list")
public class BookController {
	@Autowired
	private BookService service;
	
	@GetMapping
	@ResponseBody
	public String getBook() {
		return "테스트 문장 ^^";
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public BookDTO getBook(@PathVariable("id") int id) {
		return service.getBook(id);
	}
}
