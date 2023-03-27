package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncArraryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
		
		nameList.add("java");
		nameList.add("Python");
		nameList.add("Ruby");
		
		synchronized (nameList) {
			
			Iterator it = nameList.iterator();
			while(it.hasNext()) {
				 System.out.println(it.next());
			}	System.out.println("");		
		}
		
		Iterator it = nameList.iterator();
		while(it.hasNext()) {
			 System.out.println(it.next());
		} System.out.println("");		
		
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("suja");
		empList.add("suda");
		empList.add("sana");
		
		Iterator cwIT = empList.iterator();
		while(cwIT.hasNext()) {
			System.out.println(cwIT.next());
		}
	}

}
