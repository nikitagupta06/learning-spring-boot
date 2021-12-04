package com.spring.basics.learningspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearningSpringBootApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(LearningSpringBootApplication.class, args);
		BinarySearchImpl bsi = applicationContext.getBean(BinarySearchImpl.class);

		int result = bsi.binarySearchAlgorithm(new int[] { 12, 4, 2 }, 3);
		System.out.println(result);

	}

}
