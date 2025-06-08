package com.example.app1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApp1Controller {

	/**
	 * http://localhost:8081/hello
	 * @return
	 */
    @GetMapping("/hello")
    public String hello() {
        return "Hello from App1 Service";
    }
}
