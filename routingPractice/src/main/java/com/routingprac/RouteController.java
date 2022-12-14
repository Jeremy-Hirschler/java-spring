package com.routingprac;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class RouteController {
	@RequestMapping("")
	public String home() {
		return "Hello coding dojo!";
	}
	
	@RequestMapping("/python")
	public String python() {
		return "Python was awesome";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "Java is better";
	}
}
