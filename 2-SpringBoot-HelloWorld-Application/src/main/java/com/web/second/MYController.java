package com.web.second;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MYController {
	
	//spring Web MVC [ model view Controller ]
	
	
	@RequestMapping("/hello")
//	@ResponseBody
	public String helloWorld() {
//		return " Hello world...";
		return "welcome";
	}

}
