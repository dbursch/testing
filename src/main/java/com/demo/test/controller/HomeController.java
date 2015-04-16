package com.demo.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.test.model.MyObject;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private MyObject myObject;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
	public ModelAndView home() {
		logger.info("Welcome home!");
		
		final ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("myName",this.myObject.getName());
				
		return modelAndView;
	}
	
	
	
}
