package com.chainsys.introduction;

public class OperatorOverloading {
		 
	    void add(int a, int b)
	    {
	        int sum = a + b;
	        System.out.println(" Addition of two integer :"
	                           + sum);
	    }
	    void add(String s1, String s2)
	    {
	        String con_str = s1 + s2;
	        System.out.println("Concatenated strings :"
	                           + con_str);
	    }
	 
	    public static void main(String args[])
	    {
	        OperatorOverloading a1= new OperatorOverloading();
	        a1.add(5, 2);
	        a1.add("Operator ", " overloading ");
	    }
	}


