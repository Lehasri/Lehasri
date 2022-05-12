package com.chainsys.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<String>stringArrayList=new ArrayList<String>();
		String s1="B";
		stringArrayList.add("C");
		stringArrayList.add(s1);
		stringArrayList.add("A");
		stringArrayList.add("E");
		stringArrayList.add(s1);
		stringArrayList.add("D");
		stringArrayList.add("F");
		stringArrayList.add(s1);
		Iterator<String>string_itr=stringArrayList.iterator();
		//itetor is used for loop and not able to modify
		while(string_itr.hasNext())
		{
			System.out.print(string_itr.next()+" ");
		}
		System.out.println();
		ListIterator<String>string_list_itr=stringArrayList.listIterator();
		while(string_list_itr.hasNext())
		{
			String element=string_list_itr.next();
			string_list_itr.set(element+"--");
		}
		string_itr=stringArrayList.iterator();
		while(string_itr.hasNext())
		{
			Object element=string_itr.next();
			System.out.print(element+" ");
		}
		System.out.println();    //list iterator allows to reverse direction
		while(string_list_itr.hasPrevious())
		{
			String element=string_list_itr.previous();
			System.out.print(element+" ");
		}

	}

}
