package com.sample.springboot;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception {
		return "<h1>Springboot - Form</h1>";
	}

	@RequestMapping("/test1")
	public String test1(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		
		return "test1";
	}
	
	@RequestMapping("/test2")
	public String test2(@RequestParam("id") String id, @RequestParam("name") String name, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		
		return "test2";
	}
	
	@RequestMapping("/test3")
	public String test3(Member member, Model model) {
		return "test3";
	}
	
	@RequestMapping("/test4/{studentId}/{name}")
	public String getStudent(@PathVariable String studentId, @PathVariable String name, Model model) {
		model.addAttribute("studentId", studentId);
		model.addAttribute("name", name);
		return "test4";
	}
}
