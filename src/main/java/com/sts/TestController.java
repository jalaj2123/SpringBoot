package com.sts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController 
{

	@RequestMapping("/home")
	
	public String home()
	{
		System.out.println("this is first page");
		return "home";
	}
	
	
}
