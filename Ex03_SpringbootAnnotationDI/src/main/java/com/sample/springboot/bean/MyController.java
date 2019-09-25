package com.sample.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@Autowired
	Member member;
	@Autowired
	@Qualifier("bar")
	Printer printer;
	@Autowired
	Member member2;
	
	@RequestMapping("/")
	public @ResponseBody String root() {
		member.overridePrint();
		
		member.setPrinter(printer);
		member.overridePrint();
		
		if(member == member2) {
			System.out.println("Same instance");
		} else {
			System.out.println("Diffrenet instance");
		}
		
		return "<h1>Hello, SpringBoot!</h1>";
	}
}
