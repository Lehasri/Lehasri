package com.chainsys.classtest;
public class Numbers {
public static void main(String args[])
{
	printOneToHundred();
}

public static void printOneToHundred()
	{
	int count;
	for( count=1;count<=3;count++)
	{
	    int a1=0;
	    while(count==a1)
		{
	    int a=count*3;
	    System.out.println("Fizz");
        count+=3;
        a1=count;
		}
	System.out.println(count+"");
	}
  }
}