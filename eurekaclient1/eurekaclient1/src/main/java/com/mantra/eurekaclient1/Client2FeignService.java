package com.mantra.eurekaclient1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name="http://REST2/")
public interface Client2FeignService {
	
	@GetMapping("getData")
public String getClient2Data();
	
}
