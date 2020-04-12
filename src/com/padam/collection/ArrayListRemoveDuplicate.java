package com.padam.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class ArrayListRemoveDuplicate {
	static ArrayList<String> removeDuplicates(ArrayList<String> list) {

		// Store unique items in result.
		ArrayList<String> result = new ArrayList<String>();

		// Loop over argument list.
		for (String item : list) {
		    // If String is not in set, add it to the list and the set.
		    if (!result.contains(item)) {
			result.add(item);
		    }
		}
		return result;
	    }

	    public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("dog");
		list.add("cat");
		list.add("dog");
		list.add("dog");
		list.add("cat");
		list.add("bird");

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String temp : list) {
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}
		printMap(map);
		
		// Remove duplicates from ArrayList of Strings.
		List<String> unique = removeDuplicates(list);
		unique = Collections.synchronizedList(unique);
		Iterator<String> iterator = unique.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
		for (int i = 0; i < unique.size(); i++) {
			System.out.print(" "+unique.get(i));
		}
	    }
	    public static void printMap(Map<String, Integer> map){
	    	 
	    	for (Map.Entry<String, Integer> entry : map.entrySet()) {
	    		System.out.println("Key : " + entry.getKey() + " Value : "
	    			+ entry.getValue());
	    	}
	     
	      }
}
