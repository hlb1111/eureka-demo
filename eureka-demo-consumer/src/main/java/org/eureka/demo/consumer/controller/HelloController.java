package org.eureka.demo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/hello")
@RestController
public class HelloController {
	@Autowired
	private LoadBalancerClient client;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping({"/", ""})
	public String hello() {
		ServiceInstance instance = client.choose("eureka-producer");
		String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/hello/?";
		System.out.println(url);
		return restTemplate.getForObject(url, String.class);
	}
}
