package com.spring.learningspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.learningspringboot.scope.PersonDao;

@SpringBootApplication
public class LearningSpringBootApplicationScope {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(LearningSpringBootApplicationScope.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				SpringApplication.run(LearningSpringBootApplicationScope.class, args);
		
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
