package com.spring.learningspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.learningspringboot.scope.PersonDao;

@Configuration
@ComponentScan
public class LearningSpringBootApplicationScope {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(LearningSpringBootApplicationScope.class);

	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(LearningSpringBootApplicationScope.class)){
		
		PersonDao personDao = 
				applicationContext.getBean(PersonDao.class);
		PersonDao personDao1 = 
				applicationContext.getBean(PersonDao.class);
		
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());
		
		LOGGER.info("{}", personDao1);
		LOGGER.info("{}", personDao1.getJdbcConnection());
		}
	}

}
