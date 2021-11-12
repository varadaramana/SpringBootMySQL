package com.myapp.controller;

public class ValueOf {

	public static void main(String[] args) {
		boolean b1 = true;
		byte b2 = 100;
		short sh = 14525;
		int i = 1346516515;
		long l = 1458594864556448545L;
		float f = 15.56552654922222222222224444444444444444444444411111111111122222f;
		double d = 1546.56269859285628965478963213962698741236987412320269741026987562101d;
		char chr[] = { 'g', 'a', 'n', 'e', 's', 'h' };
		ValueOf obj = new ValueOf();
		String s1 = String.valueOf(b1);
		String s2 = String.valueOf(b2);
		String s3 = String.valueOf(sh);
		String s4 = String.valueOf(i);
		String s5 = String.valueOf(l);
		String s6 = String.valueOf(f);
		String s7 = String.valueOf(d);
		String s8 = String.valueOf(chr);
		String s9 = String.valueOf(obj);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);

	}

}
