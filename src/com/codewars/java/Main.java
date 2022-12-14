package com.codewars.java;

public class Main {

	public static void main(String[] args) {
		System.out.println(SpinWords.spinWords("There are no cakes left"));
		
		System.out.println(JadenCase.toJadenCase("this is a test"));
		
		int[] test = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
		
		System.out.println(FindOdd.findIt(test));
		
		System.out.println(MinMaxKata.min(test));
		System.out.println(MinMaxKata.max(test));
		
		System.out.println(Troll.disemvowel("You are awesomE"));
		
		System.out.println(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .   ···−−−···"));
	}
}