package com.qa.calculator;

public class Calculator {

		public static double add(double i, double x) {
			return i + x;
		}
		
		public static double multiplicaton(double i, double x) {
			return i * x;
		}
		
		public static double division(double i, double x) {
			if (x == 0) {
				System.out.println("Why are you trying to divide by zero you silly person.");
				return 0;
			} else {
				return i / x;
			}
		}
		
		public static double subtraction(double i, double x) {
			return i - x;
		}
		
}
