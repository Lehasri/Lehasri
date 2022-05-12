package com.chainsys.interfaces;

public class Calculators implements CalculatorInterface {

	@Override
	public int add(int v1, int v2) {

		int x = v1 + v2;
		System.out.println(x);
		return x;
	}

	@Override
	public int multiply(int v1, int v2) {
		int y = v1 * v2;

		System.out.println(y);
		return y;
	}

	@Override
	public int divide(int v1, int v2) {
		int z = v1 / v2;
		System.out.println(z);
		return z;
	}

}

