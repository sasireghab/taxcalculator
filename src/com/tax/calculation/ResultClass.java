package com.tax.calculation;

public class ResultClass {

	public static void main(String[] args) {

		ITaxCalculation sc = new SalaryClass();
		double result = sc.calculate(10000);
		System.out.println("RESULT :: "+result);
		
	}

}
