package com.myapp.controller;

public class Constructor {
int i;
int i1;

public Constructor () {
	 i = 10;
	 i1 = 20;
}
	public static void main(String[] args) {
		
		Constructor sai = new Constructor();
		System.out.println(sai.i);
		System.out.println(sai.i1);
	}

}
