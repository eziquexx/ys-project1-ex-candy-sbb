package com.ys.project1.ex.sbb.candy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {
	@GetMapping("/messages")
	@ResponseBody
	public String getMessage() {
		return ("hello candy!!");
	}
}
