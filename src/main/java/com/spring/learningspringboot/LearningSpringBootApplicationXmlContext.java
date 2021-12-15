package com.spring.learningspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.learningspringboot.xml.XmlPersonDao;

public class LearningSpringBootApplicationXmlContext {

	private static Logger LOGGER = LoggerFactory.getLogger(LearningSpringBootApplicationXmlContext.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {

			LOGGER.info("Beans Loaded -> {}", (Object)applicationContext.getBeanDefinitionNames()); 
			
			XmlPersonDao personDao = applicationContext.getBean(XmlPersonDao.class);

			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getXmlJdbcConnection());

		}
	}

}
