package org.eureka.demo.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-producer")
public interface HelloService {
	
	@RequestMapping(value = "/hello/", method = RequestMethod.GET)
    String hi(@RequestParam(value = "name") String name);
	
}
