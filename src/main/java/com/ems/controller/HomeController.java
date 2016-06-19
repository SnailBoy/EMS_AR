package com.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping(value = "/homePage")
public class HomeController {
	@RequestMapping (value = "/home.html")
	public ModelAndView home(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/home");
		return mv;
	}
}