package com.chainsys.classtest;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    triangleA();
	}
public static void triangleA()
{
for(int countA=1;countA<=9;countA++)
{
	for(int countB=9;countB>=countA;countB--)
	{
		System.out.print(".");
	}
	for(int countC=1;countC<=countA;countC++)
	{
		System.out.print(countC);
	}
	System.out.println();
}
}
}