package org.eureka.demo.producer.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

@Configuration
@ComponentScan(basePackages="org.eureka.demo.producer")
public class DataSourceConfig {
	
	@Bean(name = "masterDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.master")
	@Primary
	public DataSource setDataSource() {
		DataSource ds = DruidDataSourceBuilder.create().build();
		System.out.println(ds.getClass().getName());
		System.out.println(ds);
		
		return ds;
	}
	
	@Bean(name = "transactionManager")
    @Primary
    public DataSourceTransactionManager setTransactionManager(@Qualifier("masterDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
