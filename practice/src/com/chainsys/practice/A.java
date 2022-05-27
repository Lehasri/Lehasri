package com.chainsys.practice;
class A {
	 int x=10;	
void m1()
{
try {
	x=20;
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
void m2()
{
	x=10;
}
}
class B extends A{
	void m1()
	{
	x=30;	
	}
	public static void main(String args[]) {
		System.out.println("hello");
	}
}
