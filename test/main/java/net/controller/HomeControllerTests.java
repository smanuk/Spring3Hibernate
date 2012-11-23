package net.controller;

import org.springframework.web.servlet.ModelAndView;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class HomeControllerTests
{
	private static HomeController controller;
	private static ModelAndView modelAndView;
	
	@BeforeClass
	public static void setupClass()
	{
		controller = new HomeController();
		modelAndView = controller.goHome();
	}
	
	
	@Test
    public void testHandleRequestView() throws Exception
    {	
		assertEquals("home", modelAndView.getViewName());
        
        assertNotNull(modelAndView.getModel());
     
        assertEquals("Hello, welcome Spring 3 and Hibernate 4!", modelAndView.getModel().get("message"));
    }
}