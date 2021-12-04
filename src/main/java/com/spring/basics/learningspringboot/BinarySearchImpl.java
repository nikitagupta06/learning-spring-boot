package com.spring.basics.learningspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm sortALgorithm;

	public BinarySearchImpl(SortAlgorithm sortALgorithm) {
		super();
		this.sortALgorithm = sortALgorithm;
	}

	public int binarySearchAlgorithm(int[] numbers, int numbersToSearchFor) {

		int[] sortedNumbers = sortALgorithm.sort(new int[] { 12, 4, 2 });

		return 3;
	}

}
