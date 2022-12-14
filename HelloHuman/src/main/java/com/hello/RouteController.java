package com.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RouteController {
	@RequestMapping("/")
	public String name(@RequestParam (value="q", required=false) String nameQuery) {
		if (nameQuery == null) {
			return "Hello Human <br><br> Welcome to Spring Boot";
		}else {
			return "Hello " + nameQuery + "<br><br><a href='/'>Go back</a>";
		}
	}
}
