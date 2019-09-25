package com.sample.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception {
		return "<h1>Model & View</h1>";
	}
	
	@RequestMapping("/test1")
	public String test1(Model model) {
		model.addAttribute("name", "이한별");
		return "test1";
	}
	
	@RequestMapping("/mv")
	public ModelAndView test2() {
		ModelAndView mv = new ModelAndView();
		List<String> list = new ArrayList<String>();
		
		list.add("Hello");
		list.add("World");
		list.add("Foo");
		list.add("Bar");
		
		mv.addObject("list", list);
		mv.addObject("ObjectTest", "This is test.");
		mv.addObject("name", "이한별");
		
		mv.setViewName("view/myView");
		
		return mv;
	}
}
