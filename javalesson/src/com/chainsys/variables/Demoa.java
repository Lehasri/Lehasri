package com.chainsys.variables;

public class Demoa {
	public static int DataA;//static global variable
	public final int DataB;//immutable global variable(not static)
	//constructor
	public final static int DataC=300;//constant
	
	/*
	 * constructor is a special method
	 * The name of the constructor and the name of the class will be same
	 * constructor don't have return type
	 * constructors can take parameters
	 */
	public Demoa(int dataB)
	{
		/*Assigning value to the global read only field (this.Data)*/
		this.DataB=dataB;
	}
	//static method called without an object
	public static void sayHello()
	{
		System.out.println("Hello Developer!!!");
	}
	/*
	 * greetuser is a non static method
	 * this
	 */
	public void greetUser()
	{
		System.out.println("Greetings USER!!!");
	}
}
	