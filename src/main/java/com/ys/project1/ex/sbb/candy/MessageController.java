package com.ys.project1.ex.sbb.candy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/messages")
public class MessageController {
	@Autowired
	private MessageService messageService;
	
	@GetMapping("/{id}")
	@ResponseBody
	public Message getMessage(@PathVariable("id") Integer id) {
		return messageService.getMessage(id);
	}
	
	@GetMapping
	public String getMessages() {
		return "messageList";
	}
	
	@GetMapping("/api")
	@ResponseBody
	public List<Message> getMessageList() {
		return messageService.getMessageList();
	}
}
