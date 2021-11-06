package com.myapp.controller;

public class Exception {

	public static void main(String[] args) {
		try 

		{
			int i = 100/0;
		}
		 catch(ArithmeticException e)  
		{
			System.out.println(e);
		}
		System.out.println("can't devide by zero");
	}

}
