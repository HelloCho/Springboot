package com.sample.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception {
		return "JSP in Gradle";
	}
	
	@RequestMapping("/test1")
	public @ResponseBody String test1(){
		return "test1";
	}
	
	@RequestMapping("/test2")
	public @ResponseBody String test2(){
		return "test2";
	}
}
