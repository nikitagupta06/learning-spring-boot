package com.spring.learningspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.learningspringboot.cdi.SomeCdiBusiness;

@Configuration
@ComponentScan
public class LearningSpringBootApplicationCdi {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(LearningSpringBootApplicationCdi.class);

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(LearningSpringBootApplicationCdi.class);
		
		SomeCdiBusiness business = 
				applicationContext.getBean(SomeCdiBusiness.class);
		
		LOGGER.info("{} cdi- {}", business, business.getSomeCdiDao());

		applicationContext.close();
	}

}
