package in.praveen.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class HomeController {
	
	
	@GetMapping("/get")
	public String hello() {
		return "Welcome !! Eureka Client running on 8888";
	}

}
