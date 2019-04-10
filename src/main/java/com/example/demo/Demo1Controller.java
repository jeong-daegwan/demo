package com.example.demo;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Demo1Controller {
	
	@RequestMapping(value = "/test")
	public String test(Model model, HttpServletRequest request, HttpServletResponse response)  throws Exception {
	
		
		model.addAttribute("time", new Date());
		
		return "test";
	}
}
