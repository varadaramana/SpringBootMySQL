package com.myapp.controller;

public class StringandStringbufferHashcode {

	public static void main(String[] args) {
		
System.out.println("Hashcode test of String");
		String str="ganesh";
		System.out.println(str.hashCode());
		str=str+"Raju";
		System.out.println(str.hashCode());
		
		
	System.out.println("Hashcode test of StringBuffer");
	StringBuffer sb=new StringBuffer("ganesh");
	System.out.println(sb.hashCode());
	sb.append("Raju");
	System.out.println(sb.hashCode());
	}

}
