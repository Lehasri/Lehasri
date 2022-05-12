package com.chainsys.arrays;

public class ArraySolutions {

	public static void findingAverageOfFloatingNum()
	{   double sum=0;
		float num[]= {10.1f,23.4f,12.3f,13.4f,44.6f};
		int count=num.length;
		for(int i=0;i<count;i++)
		{
			System.out.print(num[i]+",");
		}
		for(int i=0;i<count;i++)
		{
		sum=sum+num[i];
		}
        System.out.println("sum is:"+sum);
        System.out.println("Average is:"+(sum/count));
	}
public static void conversion()
{
	byte b1=120;
	int b2=12887;
	byte b3=(byte) b2;
	System.out.println(b3+"");
}
public static void bubbleShort()
{
int num[]= {5,3,8,2,1};
int count=num.length;
for(int i=0;i<count;i++)
{
System.out.print(num[i]+"");	
}
System.out.println();
for(int i=0;i<count;i++)
	for(int j=0;j<count-1;j++)
	{
		if(num[j]>num[j+i])
		{
		int temp=0;
	    temp=num[j+1];
		num[j+1]=num[j];
		num[j]=temp;	
		System.out.print("After sorting");
		}
	}
for(int i=0;i<count;i++)
{
System.out.print(num[i]+"");	
}
System.out.println();
}
}
