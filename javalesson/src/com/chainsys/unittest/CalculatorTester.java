package com.chainsys.unittest;
import com.chainsys.variables.Calculator;
/*		
 * This class is for unit testing the calculator class and its methods
 * Methods to test
 * <list>
 * add(param1,param2)
 * multiply(param1,patam2)
 * divide(param1,patam2)
 * subtract(param1,patam2)
 * </list>
 * @author leha3124
 * @category to test Calculator class,its fields and methods
 * date:march 25 2022
 */

public class CalculatorTester {
	public static void testAdd()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.add(arg1,arg2);
		System.out.println("Result of Add is:"+output);
	}
	public static void testMultiply()
	{

		int arg1=100;
		int arg2=50;
		int output=Calculator.multiply(arg1,arg2);
		System.out.println("Result of multiply is:"+output);		
	}
	public static void testDivide()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.divide(arg1,arg2);
		System.out.println("Result of divide is:"+output);	
	}
	public static void testSubtract()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.subtract(arg1,arg2);
		System.out.println("Result of subtract is:"+output);	
	}
}
