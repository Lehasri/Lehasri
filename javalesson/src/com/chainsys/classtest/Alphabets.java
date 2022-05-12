package com.chainsys.classtest;
import java.util.Scanner;

public class Alphabets {

	public static void main(String[] args) {
		alphabets();

	}
	public static void alphabets()
	{
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("Enter your name"+name);
		int nameLength=name.length();
	    char[] nameToCharArray=name.toCharArray();
	    int charToAscii=(int)nameToCharArray[i];
		sc.close();
		if(((charToAscii<65)&&(charToAscii>90))&&((charToAscii<97)&&(charToAscii>122)))
		{
		System.out.println("The given name is alphabet");
		}
		if(nameLength>8)
		{
			System.out.println("Enter the name less than 8 characters");
		}
	}

}
