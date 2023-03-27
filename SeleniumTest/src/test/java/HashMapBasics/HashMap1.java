package HashMapBasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington");
		capitalMap.put("UK", "London");
		capitalMap.put("Srilanka", "Columbu");
		capitalMap.put(null, "Saudi");
		capitalMap.put(null, "kuwait");
		capitalMap.put("Russia", null);
		capitalMap.put("SA", null);
		
		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("UK"));
		
		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap.get("France"));
		
		Iterator<String> it = capitalMap.keySet().iterator();
		
		while(it.hasNext()) {
			
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("key= "+ key + " value = " +value);
			
		}System.out.println("**********************");
		
		Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();
		while(it1.hasNext()) {
			
			Entry<String,String> entry = it1.next();
			System.out.println("key= "+ entry.getKey() + " and value = " + entry.getValue());
		} System.out.println("**********************");
		System.out.println("Lamda");
		capitalMap.forEach((k,v) -> System.out.println("Key = " +k+ " Value: "+v));
	}

}
