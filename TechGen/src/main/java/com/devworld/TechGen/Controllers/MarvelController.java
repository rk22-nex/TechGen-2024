package com.devworld.TechGen.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/marvel")
public class MarvelController {

	@GetMapping("/auth")
	public String sample() {
		return "heyy";
	}
}

  