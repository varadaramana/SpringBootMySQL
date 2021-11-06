package com.myapp.controller;

public class Split {

	public static void main(String[] args) {
		String s1="Koti gani raju satyam ";  
		String[] words=s1.split("\\s");
		for(String w:words){  
		System.out.println(w);  
	}
	}

}
