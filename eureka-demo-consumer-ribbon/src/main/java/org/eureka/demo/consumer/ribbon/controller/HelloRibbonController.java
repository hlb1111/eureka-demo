package org.eureka.demo.consumer.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RequestMapping("/hello")
@RestController
public class HelloRibbonController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping({"/", ""})
	@HystrixCommand(fallbackMethod = "error")
    public String hello(@RequestParam String name) {
        name += "!";
        String url = "http://eureka-producer/hello/?name=" + name;
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }
	
	public void error() {
		
	}
}
