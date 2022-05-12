package com.chainsys.exception;
import java.util.Scanner;
public class TestDivide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator=null;
		int result=0;
		int arg1=100;
		int arg2=0;
		Scanner scanner=null;
		System.out.println("Before Try-Catch-Fianlly");
		try 
	    {
			int localWithinTry=123;
			
	    scanner =new Scanner(System.in);
	    System.out.println("Inside Try");
	    System.out.println("Enter value less than 100:");
	    calculator=new Calculator();
	    result=calculator.divide(arg1,arg2);
	    System.out.println(result+"");
	    System.out.println(localWithinTry+"");
	    }	
		catch(Exception err)
		{
			System.out.println(err.getMessage());
		}
		finally
		{
			System.out.println("Inside Finally");
			scanner.close();
		}
	}

}
