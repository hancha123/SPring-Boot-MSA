package com.example.app2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApp2Controller {

	/**
	 * http://localhost:8082/hello
	 * @return
	 */
    @GetMapping("/hello")
    public String hello() {
        return "Hello from App2 Service";
    }
}
