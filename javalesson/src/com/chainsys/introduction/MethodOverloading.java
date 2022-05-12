	package com.chainsys.introduction;
	
	public class MethodOverloading {
	
		    void show(int x)
		    {
		        System.out.println("number 1 : " + x);
		    }
		    void show(int x, int y)
		    {
		        System.out.println("number 1 : " + x
		                           + "  number 2 : " + y);
		    }
		 
		    public static void main(String[] args)
		    {
		        MethodOverloading a1= new MethodOverloading();
		        a1.show(7);
		        a1.show(9, 0);
		    }
		}
	
	
