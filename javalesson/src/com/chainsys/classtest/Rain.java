package com.chainsys.classtest;
import java.util.Scanner;
public class Rain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isItRaining();
	}
	public static void isItRaining()
	
	{
		System.out.println("Is it raining");
		int n=32;
		Scanner sc=new Scanner(System.in);
		String a;
		a=sc.next();
		sc.close();
		System.out.println("yes"+a);
		Scanner sc1=new Scanner(System.in);
		int t;
		t=sc.nextInt();
		sc.close();
		System.out.println("Say the temperature"+t);
		if(t<32)
		{
			System.out.println("Bring a heavy jacket");
		}
		else if((t<32)&&(t<50))	
		{
			System.out.println("Bring a light jacket ");
		}
		else
		{
			System.out.println("Bring an umbrella");
		}
	}

}
