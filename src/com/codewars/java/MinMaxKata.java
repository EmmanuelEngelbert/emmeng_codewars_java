package com.codewars.java;

public class MinMaxKata {
	
	public static int max(int[] list) {
	     int k =0;
	    for (int i=0; i< list.length;i++){
	      if (k < list[i]){
	          k = list[i];
	      }
	    }
	    return k;
	  }
	  
	  public static int min(int[] list) {
	  int k = max(list);
	    for (int i=0; i< list.length;i++){
	      if (k > list[i]){
	          k = list[i];
	      }
	    }
	    return k;
	  }
}
