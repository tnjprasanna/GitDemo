package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> studList = new ArrayList<String>();
		
		studList.add("Tom");
		studList.add("Ram");
		studList.add("Sam");
		studList.add("Zen");
		
		for(int i=0;i<studList.size();i++) {
			System.out.println(studList.get(i));
			
		} System.out.println("----------------------");
		
		for(String name : studList) {
			System.out.println(name);
		} System.out.println("----------------------");
		//Streams with Lamda 
		studList.stream().forEach(ele -> System.out.println(ele));
		System.out.println("----------------------");
		
		//Iterator
		Iterator<String> it = studList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
