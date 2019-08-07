package org.eureka.demo.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
@EnableEurekaClient
@ServletComponentScan("org.eureka.demo.producer.servlet")
public class EurekaDemoProducerApplication {
	
	private static Logger log = LoggerFactory.getLogger(EurekaDemoProducerApplication.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(EurekaDemoProducerApplication.class, args);
//		DataSource ds = context.getBean(DataSource.class);
//		log.debug(ds.getClass().getName() + "\n" + ds.toString());
		System.out.println(context);
		
	}
	
//	@Bean
//	@Primary
//	public DataSource primaryDataSource() {
//	    return DruidDataSourceBuilder.create().build();
//	}
}
