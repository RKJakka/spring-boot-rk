package com.spring.one;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootOneHomeController {
	
	@RequestMapping("/home")
	public String home(){
		return "Welcome home to Spring Boot One";
	} 

}
