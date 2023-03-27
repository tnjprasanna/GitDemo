package HashMapBasics;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.collections4.iterators.AbstractMapIteratorDecorator;





public class HashMap2 {
	
	public static Map<String, Integer> marksMap ;
	
	static {
		marksMap = new HashMap<>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();
		
		System.out.println(HashMap2.marksMap.get("B"));
		
		Map<String, Integer> map3 = Collections.singletonMap("test", 100);
		System.out.println(map3.get("test"));
		
		
		Map<String, String> map4 = Stream.of(new String[][] {
			{"Tom","A Grade"},{"Naveen","A+ Grade"},
			
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		
		System.out.println(map4.get("Tom"));
		map4.put("Lisa", "A++ Grade");
		System.out.println(map4.get("Lisa"));
		
		Map<String,String> map5 = Stream.of(
				new AbstractMap.SimpleEntry<>("Naveen","Java"),
				new AbstractMap.SimpleEntry<>("Tom","Python")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(map5.get("Tom"));
		
		
		Map<String,String> multiMap =	Map.of("A","1","b","2","c","3");
		System.out.println(multiMap.get("A")); 
		
		
		Map<String,String> titleMap = Map.of("Google","Google Ind","Amazon","Amaze Ind","HCL","HCL India","IBM","IBM Ind");
		System.out.println(titleMap.get("Amazon"));
		
		
		
		
		
		
				
	}

}
