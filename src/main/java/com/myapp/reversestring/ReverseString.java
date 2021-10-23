package com.myapp.reversestring;

public class ReverseString {

	public static void main(String[] args) {
		String input = "manchala srinivas";
		  
		  char[] rev = input.toCharArray();
		  
		  for (int input1 = rev.length - 1; input1 >= 0; input1--)
		  System.out.print(rev[input1]);

	}

}
