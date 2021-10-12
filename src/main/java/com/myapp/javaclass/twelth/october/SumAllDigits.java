package com.myapp.javaclass.twelth.october;

public class SumAllDigits {

	public static void main(String[] args) {
		SumAllDigits sad = new SumAllDigits();
		Integer sumValue = sad.getSumOfAllDigits(432543645);
		System.out.println("final sumValue ---->"+sumValue);
	}
	
	private Integer getSumOfAllDigits(Integer number) {
		String num = String.valueOf(number);
		Integer sum = 0;
		for(int count=0; count < num.length(); count++) {
			String s = String.valueOf(num.charAt(count));
			sum = sum + Integer.valueOf(s);
		}
		return sum;
	}

}
