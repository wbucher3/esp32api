package com.will.esp32api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class WebsiteController {
	
	public WebsiteController() {}
	
	private int timesCalled = 0;
	
	@RequestMapping(path="/update", method=RequestMethod.GET)
	@CrossOrigin(origins = "*")
	public int updateTimesCalled() {
		this.timesCalled = this.timesCalled + 1;
		return this.timesCalled;
	}
	
	@RequestMapping(path="/get", method=RequestMethod.GET)
	@CrossOrigin(origins = "*")
	public int getTimesCalled() {
		return this.timesCalled;
	}
	
	
}
