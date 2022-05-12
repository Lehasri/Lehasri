package com.chainsys.unittest;

import com.chainsys.interfaces.CalculatorInterface;
import com.chainsys.interfaces.Calculators;

public class TestCalculatorA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorInterface A1=new Calculators();
		 A1.add(20, 25);
		 A1.multiply(311, 8);
		 A1.divide(45, 8);
		}
	/*public static void testA()
	{
		public static void testMaker()
		{
			CalculatorB firstCalculator=new CalculatorB();
			if(firstCalculator instanceof ICalculator)
			{
				ICalculator contract=firstCalculator;
				int output=0;
				output=contract.add(10,5);
				System.out.println(output);
				output=contract.multiply(10,5);
				System.out.println(output);
				output=contract.divide(10,5);
				System.out.println(output);
				output=contract.multiply(10,5);
			}
			else
				System.out.println(firstCalculator.getClass().getName()+
						"does not Implement ICalculator");
		}*/
	}
  
