package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,1,3,4,7,8,1,9,7,8));
		
		LinkedHashSet<Integer> linkHashSet = new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> noDuplicates = new ArrayList<Integer>(linkHashSet);
		
		System.out.println(noDuplicates);
		
		ArrayList<Integer> mark = new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,1,3,4,7,8,1,9,7,8));
		List<Integer> uniqueMarks = mark.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueMarks);
	}

}
