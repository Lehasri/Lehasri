package com.chainsys.practice;
class A {
	 int x=10;	
static void m1()
{
x=20;
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
}
