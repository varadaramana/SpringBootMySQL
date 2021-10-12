package com.myapp.practice;

import java.util.ArrayList;
import java.util.List;

public class P10132021 {

	public static void main(String[] args) {
		isBinaryNumOrNot();
	}
	
	public static void getAddNumber() {
		int num = 4848484;
		String sNum = String.valueOf(num);
		int sum =0;
		
		for(int i=0;i<sNum.length(); i++) {
			int num1 = Character.getNumericValue(sNum.charAt(i));
			sum = sum + num1;
		}
		System.out.println("Sum value is: " + sum);
	}
	
	public static void getReveresedString() {
		String s = "venkat";
		String sRev = "";
		int length = s.length()-1;
		for(int i =length; length>=0; length--) {
			sRev = sRev.concat(String.valueOf(s.charAt(length)));
		}
		System.out.println("reversed String is: "+ sRev);
	}
	
	public static void validateArmstrongOrNot() {
		int num = 371;
		String sNum = String.valueOf(num);
		int sum = 0;
		for(int i=0; i<sNum.length(); i++) {
			int num1= Character.getNumericValue(sNum.charAt(i));
			sum = (int) (sum + Math.pow(num1, sNum.length()));
		}
		if(sum==num) {
			System.out.println("given number is a armstrong number");
		}else {
			System.out.println("It's not a armstrong number");
		}
	}
	
	public static void duplicateCharValidation() {
		String str = "Venkatesh";
		int count = 0;
		List<String> charlist = new ArrayList<>();
		for (int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			for(int j=0;j<str.length(); j++) {
				if(i!=j) {
					if(c==str.charAt(j)) {
						charlist.add(String.valueOf(str.charAt(j)));
						count++;
					}
				}
			}
		}
		System.out.println("there are " + count +" duplicate values and those are " + charlist);
	}
	
	public static void isBinaryNumOrNot() {
		int bNum = 1011110011;
		int count=0;
		if(bNum<=0 || bNum ==1) {
			System.out.println("Given number (" + bNum + ") is not a binary number");
		}
		else {
			String sNum = String.valueOf(bNum);
			for(int i=0; i<sNum.length(); i++) {
				int ch = Character.getNumericValue(sNum.charAt(i));
				if(ch>1) {
					count++;
				}
			}
			if(count==0) {
				System.out.println("Given number (" + bNum + ") is a binary number");
			}
			else {
				System.out.println("Given number (" + bNum + ") is not a binary number");
			}
		}
	}

}
