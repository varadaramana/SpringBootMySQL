package com.myapp;


public class SumNumberings {

	public static void main(String[] args) {
	    
		SumNumberings snb = new SumNumberings();
  	  Integer sumValue = snb.getSumNumberings(45689);
  	  System.out.println(sumValue);
	}
      private Integer getSumNumberings(Integer number) { 
    	  String num = String.valueOf(number);
    	  Integer sum = 0;
    	  Integer length = num.length();
    	  for (int count =0; count < length;count++) {
			String s =String.valueOf(num.charAt(count));
			sum = sum + Integer.valueOf(s);
		}
		return sum;
    	  
      }
}
