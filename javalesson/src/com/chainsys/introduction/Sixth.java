package com.chainsys.introduction;

import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CheckUserName();}
public static void CheckUserName()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter user name:");
	String name=sc.nextLine();
	sc.close();
	System.out.println("Name is:"+name);
	char [] nameAsCharacters=name.toCharArray();
	int lengthOfCharacters=nameAsCharacters.length;
	System.out.println("length of your name is:"+lengthOfCharacters);
	if(lengthOfCharacters<3) {
		System.out.println("Name must have atleast 3 letters"+lengthOfCharacters);
		return;
}
	if(lengthOfCharacters>15) {
		System.out.println("Name must have more than 15 letters"+lengthOfCharacters);
		return;
}
	String nameInUppercase=name.toUpperCase();
	nameInUppercase=nameInUppercase.trim();
	char[] uppercaseCharArray=nameInUppercase.toCharArray();
	lengthOfCharacters=uppercaseCharArray.length;
	int asciiValue=0;
	for(int index=0;index<lengthOfCharacters;index++)
	{
		asciiValue=(int) uppercaseCharArray[index];
		System.out.println("ASCII:"+asciiValue);
		if(asciiValue<65||asciiValue>90)
		{
			if(asciiValue!=32)
			{System.out.println("IN Valid Character in Name:");
			return;
			}
		}

		}
	

	for(int index=0;index<lengthOfCharacters;index++)
	{
	
System.out.println(index+" "+nameAsCharacters[index]);
	}

}

}	
