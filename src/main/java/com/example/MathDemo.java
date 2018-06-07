package com.example;

public class MathDemo {

	public static double integrate(Integrable func, double x1, double x2, int numSlices) {
		if (numSlices < 1) numSlices = 1;
		double delta = (x2 - x1) / numSlices;
		double start = x1 + delta / 2.0;
		double sum = 0.0;
		for (int i = 0; i < numSlices; i++) {
			sum += delta * func.eval(start + delta * i);
		}
		return sum;
	}

	public static void main(String[] args) {
		double d1 = integrate(x -> x, 10, 100, 1000);
		System.out.println(d1);
		double d2 = integrate(x -> x * x, 10, 100, 1000);
		System.out.println(d2);
		double d3 = integrate(x -> Math.pow(x, 3), 10, 100, 1000);
		System.out.println(d3);
		double d4 = integrate(Math::sin, 10, 100, 1000);
		System.out.println(d4);
		System.out.println("++++++++++++++++++++++");
		double d5 = integrate(x -> x, 10, 100, 10000);
		System.out.println(d5);
		double d6 = integrate(x -> x * x, 10, 100, 10000);
		System.out.println(d6);
		double d7 = integrate(x -> Math.pow(x, 3), 10, 100, 10000);
		System.out.println(d7);
		double d8 = integrate(Math::sin, 10, 100, 10000);
		System.out.println(d8);
	}
}
