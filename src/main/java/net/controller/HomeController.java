package net.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
	@RequestMapping({"/home", "/"})
	public ModelAndView goHome()
	{
		// hard coding messages is not really good working practice
		// In principle these messages can be acquired using a service
		// which connects to some content management systems
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello, welcome Spring 3 and Hibernate 4!");
		
		return new ModelAndView("home", "message", sb.toString());
	}
}