package com.collection.framework.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CityPopulation  {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
//        LinkedHashMap<String, String> sortedMap = new LinkedHashMap<>();
//        ArrayList<String> list = new ArrayList<>();
        map.put("Nagpur", 380000);
        map.put("Wardha", 1300000);
        map.put("Amravati", 2100000);
        map.put("Arvi", 150000);
        map.put("Warud", 200000);
        map.put("Chandrapur", 140000);
        
        ArrayList<String> arr=new ArrayList<>(map.keySet());
        
        Collections.sort(arr);
        
        for(String m : arr ) {
        	int p=map.get(map);
        	//System.out.println(m+ " " +p);
        
        
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            list.add(entry.getValue());
//        }
//        Collections.sort(list, new Comparator<String>() {
//            public int compare(String str, String str1) {
//                return (str).compareTo(str1);
//            }
//        });
//        for (String str : list) {
//            for (Entry<String, String> entry : map.entrySet()) {
//                if (entry.getValue().equals(str)) {
//                    sortedMap.put(entry.getKey(), str);
//                }
//            }
//        }
//        System.out.println(sortedMap);
    }
	}
}

//		HashMap<String, Integer> city=new HashMap<String, Integer>();
//		
//		city.put("Nagpur", 4500000);
//		city.put("Wardha", 1300000);
//		city.put("Amravati", 2000000);
//		city.put("Warud", 250000);
//		city.put("Arvi", 200000);
//		city.put("Chandrapur", 1700000);
//		
//		//sortbykey();
//		
//	     for (Map.Entry<String, String> entry : map.entrySet()) {
//	            city.add(entry.getValue());
//	        }
//	        Collections.sort(city, new Comparator<String>() {
//	            public int compare(String str, String str1) {
//	                return (str).compareTo(str1);
//	            }
//	        });
//	        for (String str : city) {
//	            for (Entry<String, String> entry : map.entrySet()) {
//	                if (entry.getValue().equals(str)) {
//	                    sortedMap.put(entry.getKey(), str);
//	                }
//	            }
//		
//	}
//	
//
//}

//static Map<String, Integer> city = new HashMap<>();
//
//public static void sortbykey()
//{
//   
//    TreeMap<String, Integer> sorted = new TreeMap<>();
//
//    sorted.putAll(city);
//
//    for (Map.Entry<String, Integer> entry : sorted.entrySet()) 
//        System.out.println("Key = " + entry.getKey() + 
//                     ", Value = " + entry.getValue());        
//}
