package com.example.batchprocessing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication is a convenience annotation that adds all of the following:

1. @Configuration: Tags the class as a source of bean definitions for the application context.
2. @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings,
	other beans, and various property settings.
3. @ComponentScan: Tells Spring to look for other components, configurations, and services in
	the com/example package, letting it find the controllers.
 */
@SpringBootApplication
public class BatchProcessingApplication {

	// To read csv, transform the data input, insert output to in-memory database (HyperSQL Database)
	public static void main(String[] args) {
		System.exit(SpringApplication.exit(SpringApplication.run(BatchProcessingApplication.class, args)));
	}
}
