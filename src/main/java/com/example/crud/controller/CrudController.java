package com.example.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CrudController {
	
	//principal probando git
	@GetMapping({"/","/home","/index"})
	public String home() {	
		return "Home";
	}

}
