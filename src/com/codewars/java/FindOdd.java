package com.codewars.java;

public class FindOdd {
	public static int findIt(int[] a) {
	   
		int h = 0;
		 //check numbers in array
		for (int k, i=0; i<a.length;i++) {
			k=0;
			for (int j=0; j<a.length;j++) {
				if (a[i]==a[j]) {
					k++;  //count occurances
				}
				 //list odd occurance
			} if (k % 2 == 1) { 
				h = a[i];
		}
	  }
		return h; 
}
}
