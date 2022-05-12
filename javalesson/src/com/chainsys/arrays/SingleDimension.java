package com.chainsys.arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class SingleDimension {
	public static void creatingArrayOne()
	{
		int firstintArray[]=new int[10];
		int secondintArray[]= {1,2,3,4};
		System.out.println(firstintArray);
		System.out.println(secondintArray);
	}
	public static void creatingArrayTwo()
	{
		int firstValue=100;
		int[] numbers= {10,20,30,40};
		int lengthOfNumbers=numbers.length;
		System.out.println("Length of number:"+lengthOfNumbers);
		for(int x:numbers)
		{
			System.out.println(x+"");
		}
	}
public static void printingSizeOfDays()
{
int days[];
Scanner scanner=new Scanner(System.in);
System.out.println("Enter size of days");
int size=scanner.nextInt();
scanner.close();
days=new int[size];
int lengthOfDays=days.length;
System.out.println("length of Days:"+lengthOfDays);
if(days==null)
{
	System.out.println("The day is null");
}
for(int i=0;i<lengthOfDays;i++)
{
	days[i]=(int)(Math.random()*10);
	System.out.println(days[i]);
}
}
public static void printingMonth()
{

int month[]=new int[12];
int lengthOfMonth=month.length;
System.out.println("length of month:"+lengthOfMonth);

for(int i=0;i<lengthOfMonth;i++)
{
	System.out.print(i+"-"+month[i]+",");
	month[1]=31;
}
try 
{
	month[11]=31;
	System.out.println("Hi...");
}
catch(Exception err)
{
	System.out.println("Error!!!"+err.getMessage());
	
}
}
public static void daysOfMonth()
{
	int Month[]= {12,8,9,4};
	int lengthOfMonth=Month.length;
	System.out.println("length of month:"+lengthOfMonth);
	for(int i=0;i<lengthOfMonth;i++)
	{
	System.out.println(i+"-"+Month[i]+",");	
	}
}
public static void sorting()
{
	int numberArray[]=new int[10];

	for(int i=0;i<10;i++)
		numberArray[i]=-3*i;
		System.out.println("original contents:");
		int lengthOfArray=numberArray.length;
		for(int i=0;i<lengthOfArray;i++)
		{
			System.out.print(numberArray[i]+",");
		}
		System.out.println();
		System.out.println("length of array:"+lengthOfArray);
	Arrays.sort(numberArray);
	System.out.println("After sorting:");
	for(int i=0;i<lengthOfArray;i++)
	{
		System.out.print(numberArray[i]+"");
	}
	System.out.println();
	Arrays.fill(numberArray,2,6,-1);
	System.out.println("After fill()I");
	for(int i=0;i<lengthOfArray;i++)
	{
		System.out.print(numberArray[i]+"");
	}
	System.out.println();
}
public static void string()
{
	String s1="Today is a very hot day";
	char[] data=s1.toCharArray();
	int count=data.length;
	for(int i=0;i<count;i++)
	{
	System.out.print(data[i]+"-"+(int)data[i]+" ");
	}
}
}