package com.spring.learningspringboot.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

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

}
