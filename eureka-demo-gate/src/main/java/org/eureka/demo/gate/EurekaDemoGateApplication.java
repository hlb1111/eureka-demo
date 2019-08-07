package org.eureka.demo.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class EurekaDemoGateApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaDemoGateApplication.class, args);
	}
}
