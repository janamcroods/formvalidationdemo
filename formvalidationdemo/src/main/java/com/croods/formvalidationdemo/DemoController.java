package com.croods.formvalidationdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DemoController 
{

	@RequestMapping("/")
	public String name() 
	{
		return "index";		
	}

}
