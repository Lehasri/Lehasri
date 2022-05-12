package com.chainsys.unittest;

import com.chainsys.variables.Demoa;

/*		
 * tester class for global variables
 * @author leha3124
 * @category to test demo class,its fields and methods
 * date:march 24 2022
 */
public class VariableTester {
	/*test static,constant,immutable variables*/
public static void testGlobalVariables()
{//display the value of static field
	//value i zero(default value)
	//DataA is accessed without creating an object
	System.out.println("DataA:"+Demoa.DataA);
	//display the value of immutable field
	//this is not possible without an object
	//System.out.println("DataB:"+Demoa.DataB);
	//display the value of constant field
System.out.println("DataC:"+Demoa.DataC);
//modifying value of the static field DataA
Demoa.DataA=2345;
System.out.println("DataA:"+Demoa.DataA);
//modifying value of the static field DataC
//ERROR:The final field Demoa.DataC cannot be assigned
//Demoa.DataC=2345
}
/*To test how to use Immutable variables of a class
 * created on:25 Mar 2022
 */
public static void testImmutableVariables()		
{
	/*Cannot make a static reference to the non static field Demoa.DataB
	 * Demoa.DataB=123;
	/ * 
	 * first create an object or the class
	 * pass an int value as an argument to the constructor
	 * access the immutable instance field using the object reference
	 */
	Demoa firstObject=new Demoa(123);
	System.out.println(firstObject.DataB);
	/*
	 * value assigned to an immutable field can not be changed
	 * value for the immutable field can be assigned only through the constructor
	 */
	//firstObject.DataB=567;
}
	/*
	 * Calling static method using
	 */
	

public static void testStaticMethod()
{
	Demoa.sayHello();
}
/*
 * calling non-static method using object reference
 * without creating an object,non-static methods can not be called
 * created on:25 March 2022
 */
public static void testNonStaticMethod()
{
//Error
//Demoa.greetUser();
Demoa firstObject=new Demoa(111);
//call the non static method
firstObject.greetUser();
}
}
