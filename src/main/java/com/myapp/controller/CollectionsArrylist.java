package com.myapp.controller;

import java.util.ArrayList;
import java.util.List;

public class CollectionsArrylist {

	public static void main(String[] args) {
		List<String> S1 = new ArrayList<>();
		S1.add("matta");
		S1.add("ganesh");
		S1.add(1, "sai");
		System.out.println(S1);

		S1.add("matta");
		S1.add("ganesh");
		S1.add(1, "sai");
		System.out.println(S1);
		S1.set(1, "S/O koti");
		System.out.println(S1);

		S1.add("matta");
		S1.add("gani");
		S1.add(1, "sai");
		System.out.println(S1);
		S1.remove(1);
		System.out.println(S1);
		S1.remove("gani");
		System.out.println(S1);

	}

}
