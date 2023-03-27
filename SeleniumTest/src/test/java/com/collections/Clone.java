package com.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("Java");
		arr1.add("Python");
		arr1.add("ruby");
		arr1.add("JS");
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Testing");
		arr2.add("DevOps");
		
		ArrayList<String> cloneList = (ArrayList<String>) arr1.clone();
		System.out.println(cloneList);
		
		System.out.println(arr1.indexOf("ruby"));
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		//numbers.removeIf(num -> num%2 == 0);
		//System.out.println(numbers);
		numbers.removeIf(num1 -> num1%2 != 0);
		System.out.println(numbers);
	}

}
