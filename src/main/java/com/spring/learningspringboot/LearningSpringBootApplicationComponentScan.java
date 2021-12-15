package com.spring.learningspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.componentScan.ComponentDao;

@Configuration
@ComponentScan("com.spring.componentScan")
public class LearningSpringBootApplicationComponentScan {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(LearningSpringBootApplicationComponentScan.class);

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(LearningSpringBootApplicationComponentScan.class);
				
		
		ComponentDao componentDao = 
				applicationContext.getBean(ComponentDao.class);
		
		LOGGER.info("{}", componentDao);
		LOGGER.info("{}", componentDao.getComponentJdbcConnection());
		
		applicationContext.close();
	}

}
