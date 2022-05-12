package com.chainsys.introduction;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
swappingTwoNumbers();
	}
public static void swappingTwoNumbers()
{
	int x=67;
	int y=92;
	System.out.println("x:="+x+"y:="+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("x:="+x+"y:="+y);
	
	
}
}
