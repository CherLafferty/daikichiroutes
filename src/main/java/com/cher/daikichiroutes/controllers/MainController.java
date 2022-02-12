package com.cher.daikichiroutes.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class MainController {

	@RequestMapping("")
		public String daikichi() {
			return "<h1>Welcome</h1>";
		}
	
	@RequestMapping("/today")
	public String today() {
		return "<h1>Today you will find luck in all your endeavors.</h1>";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "<h1>Tomorrow an opportunity will arise, so be sure to be open to new ideas.</h1>";
	}
	
	
}
