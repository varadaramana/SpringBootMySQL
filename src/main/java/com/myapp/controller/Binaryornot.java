package com.myapp.controller;

public class Binaryornot {

	public static void main(String[] args) {

		System.out.printf("Does number %d is a binary number? %b %n", 0101010011, isBinary1(0101010011));

	}

	public static boolean isBinary1(int number) {
		int copyOfInput = number;

		while (copyOfInput != 0) {
			if (copyOfInput % 10 > 1) {
				return false;
			}
			copyOfInput = copyOfInput / 10;
		}
		return true;

	}

}
