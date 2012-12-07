package net.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.domain.WeatherForecast;
import net.service.WeatherService;

@Controller
public class WeatherController
{
	@Autowired
	private WeatherService weatherService;
	
	@RequestMapping("weather")
	public String listForecasts(Map<String, Object> forcasts)
	{
		forcasts.put("forcasts", weatherService.listForcast());
		
		return "weatherForcasts";
	}
}
