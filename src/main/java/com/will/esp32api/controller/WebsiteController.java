package com.will.esp32api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebsiteController {
	
	public WebsiteController() {}
	
	private int timesCalled = 0;
	
	@CrossOrigin(origins = "https://willsbutton.netlify.app/")
	@RequestMapping(path="/update", method=RequestMethod.GET)
	public int updateTimesCalled() {
		this.timesCalled = this.timesCalled + 1;
		return this.timesCalled;
	}
	
	@CrossOrigin(origins = "https://willsbutton.netlify.app/")
	@RequestMapping(path="/get", method=RequestMethod.GET)
	public int getTimesCalled() {
		return this.timesCalled;
	}
	
	@CrossOrigin(origins = "https://willsbutton.netlify.app/")
	@RequestMapping(path="/", method=RequestMethod.GET)
	public boolean test() {
		return true;
	}
	
	
}
