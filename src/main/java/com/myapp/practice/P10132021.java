package com.myapp.practice;

public class P10132021 {

	public static void main(String[] args) {

	}
	
	public void getAddNumber() {
		int num = 4848484;
		String sNum = String.valueOf(num);
		int sum =0;
		
		for(int i=0;i<sNum.length(); i++) {
			int num1 = Character.getNumericValue(sNum.charAt(i));
			sum = sum + num1;
		}
		System.out.println("Sum value is: " + sum);
		
	}

}
