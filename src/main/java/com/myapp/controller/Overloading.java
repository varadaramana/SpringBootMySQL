package com.myapp.controller;
class atta{
	static int add(int a,int b) {return a+b;}
	static int add(int a, int b, int c) {return a+b+c;}
	static int substraction(int a,int b) {return a-b;}
	static  int multiply (int a,int b){return a*b;}
	static int devide(int a,int b) {return a/b;}
}
public class Overloading {

	public static void main(String[] args) {
		System.out.println(atta.add(10, 1500));
		System.out.println(atta.add(0, 0, 0));
		System.out.println(atta.substraction(230, 103));
		System.out.println(atta.multiply(10,12));
		System.out.println(atta.devide(40, 5));
		
	}

}
