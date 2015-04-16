package com.demo.test.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.test.model.MyFirstService;

@Controller
public class SearchController {
	
	@Autowired
	private MyFirstService myFirstService;
	
	private static final Logger logger = LoggerFactory.getLogger(SearchController.class);
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView search() {
		logger.info("Welcome home search!.");
		
		final ModelAndView modelAndView = new ModelAndView("search");
		
		modelAndView.addObject("resourceValue", this.myFirstService.getResourceValue());
		
		return modelAndView;
	}
	
	
}
