package com.kerbag.fleetapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
	
	//thymeleaf will check for index html in template folder and return it
	@GetMapping("/index")
	public String goHome() {
		return "index";
	}

}
