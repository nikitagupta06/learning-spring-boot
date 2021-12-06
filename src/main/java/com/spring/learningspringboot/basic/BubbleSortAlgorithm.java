package com.spring.learningspringboot.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{
	public int[] sort(int [] numbers) {
		//sorting logic
		int result[] = {2,4,12}; 
		
		System.out.println("BubbleSort");
		
		return result;
	}
}
