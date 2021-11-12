package com.myapp.controller;

public class Capacity {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();  
		System.out.println(sb.capacity());
		sb.append("Kiran");  
		System.out.println(sb.capacity());
		sb.append("Maths is my favourite subject");  
		System.out.println(sb.capacity());
		sb.append("mpagks");
		System.out.println(sb.capacity());
	}

}
