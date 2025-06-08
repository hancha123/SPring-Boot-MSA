package com.example.app2.controller;

import com.example.common.dto.GreetingDto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	/**
	 * 자체적으로 실행 시 http://localhost:8082/greeting 
	 * @return
	 */
    @GetMapping("/greeting")
    public GreetingDto getGreeting() {
        return new GreetingDto("안녕하세요!", "app2-service");
    }    
    
    /**
     * 자체적으로 실행 시 http://localhost:8082/greetingList
     * @return
     */
    @GetMapping("/greetingList")
    public List<GreetingDto> getGreetingList() {    	
    	List<GreetingDto> list = new ArrayList<GreetingDto>();   	
    	
    	list.add(new GreetingDto("안녕하세요!", "app2-service"));
    	list.add(new GreetingDto("두번 째 안녕하세요!", "app2-service twice"));
    	
        return list;
    }
}
