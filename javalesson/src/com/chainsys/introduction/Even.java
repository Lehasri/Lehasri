package com.chainsys.introduction;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	PrintEvenOneToHundred();

	}
	public static void PrintEvenOneToHundred() {
	int count=0;
	for(count=0;count<=100;count++)
	{
		if(count%2==0)
		{
			System.out.println(count+" ");
		}
	}
}
}