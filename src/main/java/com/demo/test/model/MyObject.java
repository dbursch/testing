package com.demo.test.model;

import org.springframework.stereotype.Service;

@Service
public class MyObject {
	
	private final String name = "Mein Name ist Burge";
	
	public String getName() {
		return this.name;
	}

}
