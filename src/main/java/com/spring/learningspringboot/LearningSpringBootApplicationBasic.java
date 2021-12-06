package com.spring.learningspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.learningspringboot.basic.BinarySearchImpl;

@SpringBootApplication
public class LearningSpringBootApplicationBasic {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(LearningSpringBootApplicationBasic.class, args);
		BinarySearchImpl bsi = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl bsi1 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(bsi);
		System.out.println(bsi1);

		int result = bsi.binarySearchAlgorithm(new int[] { 12, 4, 2 }, 3);
		System.out.println(result);
		

	}

}
