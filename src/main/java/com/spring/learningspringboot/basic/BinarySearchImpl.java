package com.spring.learningspringboot.basic;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	private static Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);

	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortALgorithm;
//
//	public BinarySearchImpl(SortAlgorithm sortALgorithm) {
//		super();
//		this.bubbleSortALgorithm = sortALgorithm;
//	}
	
	public int binarySearchAlgorithm(int[] numbers, int numbersToSearchFor) {

		int[] sortedNumbers = sortALgorithm.sort(new int[] { 12, 4, 2 });
		System.out.println(sortALgorithm);
		return 3;
	}
	
//	@PostConstruct
//	public void postConstruct() {
//		LOGGER.info("POST CONSTRUCT");
//	}
//	
//	@PreDestroy
//	public void preDestroy() {
//		LOGGER.info("PRE DESTROY");
//	}

}
