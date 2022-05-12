package com.chainsys.classtest;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenNumber();

	}
public static void evenNumber()
{
	long L=1546903;
	while(L>0)
	{
	long remainder=L%10;
	if(remainder%2==0)
	{
	System.out.println(remainder);	
	}
    L=L/10;
	}
}
}