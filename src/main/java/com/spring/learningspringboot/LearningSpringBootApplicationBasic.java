package com.spring.learningspringboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.learningspringboot.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class LearningSpringBootApplicationBasic {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(LearningSpringBootApplicationBasic.class);
		BinarySearchImpl bsi = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl bsi1 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(bsi);
		System.out.println(bsi1);

		int result = bsi.binarySearchAlgorithm(new int[] { 12, 4, 2 }, 3);
		System.out.println(result);
		
		applicationContext.close();
	}

}
