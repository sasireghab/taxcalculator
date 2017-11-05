package com.tax.calculation;

/*
 * This interface is responsible for calculating tax
 */
public interface ITaxCalculation {

	/*
	 * This method is used to calculating the income tax
	 * 
	 * @param salary, gross salary to calculate tax
	 * 
	 * @return netSalary, calculated netSalary
	 */
	public double calculate(double salary);
}
