package com.codewars.java;

import java.util.Arrays;
import java.util.List;

public class JadenCase {
	
	public static String toJadenCase(String phrase) {
		//arraylist of the split words 
		if (phrase != null && phrase.length()!= 0) {
			List<String> items = Arrays.asList(phrase.split(" "));	
			//arraylist within a for loop iterating over i
			for (int i=0;i<items.size();i++) {
				//slit the string into an arraylist containing chars
				List<String> storage = Arrays.asList(items.get(i).split(""));
				//set the 0th element to uppercase
				storage.set(0, storage.get(0).toUpperCase());
				//join the arraylist 
				//set the element at index i (OG arraylist) to the joined joined array list from before
				items.set(i, String.join("", storage));
			}
			return String.join(" ", items);
		} else {
			return null;
		}
}
}