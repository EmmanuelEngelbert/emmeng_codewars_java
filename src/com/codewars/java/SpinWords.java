package com.codewars.java;
//Seperate by spaces to get arrays of words
//Reverse the order of the arrays containing words with more than five letters
//Merge the arrays into a string 
public class SpinWords {
	
	  public static String spinWords(String sentence) {
		    
		String[] sentenceArray = sentence.split(" ");
		   
		 for (int i = 0; i <sentenceArray.length; i++) {
			 if (sentenceArray[i].length() >= 5) {
				 sentenceArray[i] = new StringBuilder(sentenceArray[i]).reverse().toString();
			 }
		 }
		 return String.join(" ", sentenceArray);
		
		 /* Alternatively 
		  StringJoiner joiner = new StringJoiner(" ");
		 for (String string : sentenceArray) {
			 joiner.add(string);
		 }
		 return joiner.toString();
		  	
	  }*/
}
}
