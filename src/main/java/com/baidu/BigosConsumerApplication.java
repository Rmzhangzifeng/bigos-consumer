package com.baidu;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.baidu"})
public class BigosConsumerApplication {

	private static Logger logger = Logger.getLogger(BigosConsumerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BigosConsumerApplication.class, args);
		logger.info("============= SpringBoot Start Success =============");
	}
}
