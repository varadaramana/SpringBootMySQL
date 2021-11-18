package com.myapp.controller;

class sai {
	int i = 10;
}

class gani extends sai {
	float f = 15.0232579545453f;
}

class matta extends gani {
	double d = 96532.94536594562346d;
}

public class Inheritance {

	public static void main(String[] args) {
		matta km = new matta();
		System.out.println(km.i);
		System.out.println(km.f);
		System.out.println(km.d);

	}

}
