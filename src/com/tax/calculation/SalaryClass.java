package com.tax.calculation;

/*
 * Implement the tax calculation interface
 */
public class SalaryClass implements ITaxCalculation{
	
	/*
	 * This method is used to calculating the income tax
	 * 
	 * @param salary, gross salary to calculate tax
	 * 
	 * @return netSalary, calculated netSalary
	 */
	public double calculate(double salary)
	{
		double tax = 0;
		double netSalary = 0;
		
		System.out.println(" TAX CALCULATION RESULT ");
		System.out.println(" ********************** ");

		if(salary >= 20000 && salary <= 30000)
		{
			tax = salary * 10/100;
			netSalary = salary - tax;
			System.out.println(" SALARY AMOUNT :: "+salary);
			System.out.println(" TAX AMOUNT :: "+tax);
			System.out.println(" NETSALARY AMOUNT :: "+netSalary);
		}
		else if(salary >= 30000 && salary <= 50000)
		{
			tax = salary * 20/100;
			netSalary = salary - tax;
			System.out.println(" SALARY AMOUNT :: "+salary);
			System.out.println(" TAX AMOUNT :: "+tax);
			System.out.println(" NETSALARY AMOUNT :: "+netSalary);
		}
		else if(salary > 50000)
		{
			tax = salary * 30/100;
			netSalary = salary - tax;
			System.out.println(" SALARY AMOUNT :: "+salary);
			System.out.println(" TAX AMOUNT :: "+tax);
			System.out.println(" NETSALARY AMOUNT :: "+netSalary);
		}
		else
		{
			netSalary = salary;
			System.out.println(" NETSALARY AMOUNT :: "+netSalary);
			System.out.println(" SALARY AMOUNT :: "+salary);
			System.out.println(" YOUR SALARY IS NOT ELIGIBLE FOR TAX ");
		}
		return netSalary;
	}
}
