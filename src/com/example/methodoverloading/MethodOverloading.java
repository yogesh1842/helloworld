package com.example.methodoverloading;

public class MethodOverloading {
	private static void display(int a) {
		System.out.println("Arguments: " + a);
	}

	private static void display(int a, int b) {
		System.out.println("Arguments: " + a + " and " + b);
	}

	private static void display(String a) {
		System.out.println("Arguments: " + a);
	}

//	private static String display(String a) {
//		System.out.println("Arguments: " + a);
//	}

	public static void main(String[] args) {
		display(1);
		display(1, 4);
		display("Method overloaded");
	}
}
