package com.myapp.javaclass.twelth.october;

public class SumAllDigits {

	public static void main(String[] args) {
		SumAllDigits sad = new SumAllDigits();
		Integer sumValue = sad.getSumOfAllDigits(4325);
		//4+3+2+5+4+3+6+4+5 = 36
		System.out.println("final sumValue ---->"+sumValue);
	}
	
	private Integer getSumOfAllDigits(Integer number) {
		String num = String.valueOf(number);
		Integer sum = 0;
		Integer length = num.length();
		for(int count=0; count < length ; count++) {
			String s = String.valueOf(num.charAt(count));
			sum = sum + Integer.valueOf(s);
		}
		return sum;
	}

}
