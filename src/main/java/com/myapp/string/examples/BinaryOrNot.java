package com.myapp.binaryornot;

public class BinaryOrNot {

	public static void main(String[] args) {
		String value = "11000011110111010101";
		for(int i = 0; i < value.length(); i++) {
		        int tempB = value.charAt(i);
		        if (tempB == '0' || tempB == '1') {
		             continue; 
		        }
		        System.out.println("false");
		         return;
		   }
		 
		System.out.println("true");
		   return;

	}

}
