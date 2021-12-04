package com.spring.basics.learningspringboot;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm{
	public int[] sort(int [] numbers) {
		//sorting logic
		int result[] = {2,4,12}; 
		
		System.out.println("BubbleSort");
		
		return result;
	}
}
