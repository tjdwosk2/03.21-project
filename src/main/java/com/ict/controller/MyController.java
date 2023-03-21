package com.ict.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("mymain.do")
	public ModelAndView MyMain() {
		ModelAndView mv = new ModelAndView("mymain");
		return mv;
	}
	
	@RequestMapping("mymain1.do")
	public ModelAndView MyMain1() {
		ModelAndView mv = new ModelAndView("mymain1");
		return mv;
	}
	@RequestMapping("mymain2.do")
	public ModelAndView MyMain2() {
		ModelAndView mv = new ModelAndView("mymain2");
		return mv;
	}
	
	
	@RequestMapping("homepage.do")
	public ModelAndView HomePage() {
		ModelAndView mv = new ModelAndView("homepage");
		return mv;
		
	}
	
}
