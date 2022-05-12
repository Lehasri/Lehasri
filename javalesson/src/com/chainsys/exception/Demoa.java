package com.chainsys.exception;
import java.util.Scanner;
public class Demoa {
public static void m4()
{
	System.out.println("Before Try");
    int x=0,y=0,z=0;
    String s1=null,s2=null;
    java.util.Scanner sc=null;
    try
    {
    	sc=new Scanner(System.in);
    	System.out.println("Inside Try");
    	System.out.println("Enter value for x");
    	s1=sc.nextLine();
    	System.out.println("Enter value for y");
    	s2=sc.nextLine();
    	x=Integer.parseInt(s1);
    	y=Integer.parseInt(s2);
    	z=x/y;
    	System.out.println("Result"+z);
    }
     /*catch(Exception err)-base class cannot be first
      {
     System.out.println("Inside Catch3"+err.getMessage());
     System.out.println("ErrorType"+err.getClass.getName());
     }	*/
     
    catch(ArithmeticException err)//child
    {
    	System.out.println("Inside Catch1"+err.getMessage());
    	System.out.println("ErrorType"+err.getClass().getName());
    }
    catch(NumberFormatException err)//child
    {
    	System.out.println("Inside Catch2"+err.getMessage());
    	System.out.println("ErrorType"+err.getClass().getName());
    }
    catch(Exception err)//base
    {
    	System.out.println("Inside Catch2"+err.getMessage());
    	System.out.println("ErrorType"+err.getClass().getName());
    }
    finally
    {
    	System.out.println("Inside Finally");
    }
}
}
