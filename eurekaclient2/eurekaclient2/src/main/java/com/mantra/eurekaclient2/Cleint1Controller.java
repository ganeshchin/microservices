package com.mantra.eurekaclient2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cleint1Controller {
	
	@GetMapping("getdata")
	public String getData() {
		return "get retrun data";
		
	}

}
