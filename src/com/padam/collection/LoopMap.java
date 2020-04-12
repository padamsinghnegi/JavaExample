package com.padam.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
 
public class LoopMap {
 
  public static void main(String[] args) {
 
	// initial a Map
	Map<String, String> map = new HashMap<String, String>();
	map.put("1", "Jan");
	map.put("2", "Feb");
	map.put("3", "Mar");
	map.put("4", "Apr");
	map.put("5", "May");
	map.put("6", "Jun");
 
	System.out.println("Example 1...");
	// Map -> Set -> Iterator -> Map.Entry -> troublesome
	Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
	while (iterator.hasNext()) {
		Entry<String, String> mapEntry =  iterator.next();
		System.out.println("The key is: " + mapEntry.getKey()
			+ ",value is :" + mapEntry.getValue());
	}
 
	System.out.println("Example 2...");
	// more elegant way
	for (Map.Entry<String, String> entry : map.entrySet()) {
		System.out.println("Key : " + entry.getKey() + " Value : "
			+ entry.getValue());
	}
 
	System.out.println("Example 3...");
	// weired way, but works anyway
	for (String key : map.keySet()) {
		System.out.println("Key : " + key.toString() + " Value : "
			+ map.get(key));
	}
 
  }
 
}