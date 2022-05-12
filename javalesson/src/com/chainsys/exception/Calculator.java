package com.chainsys.exception;
public class Calculator {
	public int divide(int pValueA,int pValueB)
	{
		return pValueA/pValueB;
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Try-Catch-Finally");
		Calculator calculator=null;
		int result=0;
		try
		{
		calculator =new Calculator();
		result=calculator.divide(100,0);
		System.out.println(result+"");		
		}
       catch(Exception err)
		{
    	   String msg=err.getMessage();
    	   System.out.println(msg+"");
		}
		finally
		{
			System.out.println("Inside finally");
		}
		System.out.println("After Try-Catch-Finaly");
	}

}
