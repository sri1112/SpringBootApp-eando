package com.web.welcome.msg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	
	@ResponseBody
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome this is Springboot first web application";
	}

}
