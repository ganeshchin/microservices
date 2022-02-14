package com.mantra.eurekaclient1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cleint1Controller {
	@Autowired
	private Client2FeignService client2FeignService;
	
	@GetMapping("getdata")
	public String getData() {
		 String str=client2FeignService.getClient2Data();
		return "get retrun data"+str;
		
	}

}
