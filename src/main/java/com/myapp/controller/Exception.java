package com.myapp.controller;

public class Exception {

	public static void main(String[] args) {
		try

		{
			System.out.println("try block");
			int i = 100 / 0;
			System.out.println(i);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println(e);
			System.out.println("can't devide by zero");
		}
		
		finally {
			System.out.println("finally block is allways printed");
		}
		System.out.println("rest of code is printed");
	}

}
