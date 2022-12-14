package com.routingprac;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping("/m/{school}")
	public String dojo(@PathVariable("school") String school) {
		if (school.contains("-")) {
			String[] strArr = school.split("-", 2);
			return String.format("%s %s is located in %s.", strArr[0], strArr[1], strArr[0]);
		}else {
			
			return "School: " + school;
		}
	}
	
}
