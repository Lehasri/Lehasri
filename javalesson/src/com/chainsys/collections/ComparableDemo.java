package com.chainsys.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortComparebleEmp();
		compareEmp();
	}
	 public static void compareEmp() {
	        Emp e1=new Emp(100);
	        e1.Name="Sam";
	        Emp e2=new Emp(200);
	        e2.Name="musk";
	        Emp e3=new Emp(300);
	        e2.Name="Jobs";
	        List<Emp> empList= new ArrayList<>();
	        empList.add(e1);
	        empList.add(e2);
	        empList.add(e3);
	        System.out.println(empList);
	        // Collections.sort(empList);
	        System.out.println(empList);
	        /* The meyhod sort(List<T>) in the type Collections
	         * is not applicable for the arguments(ArrayList<Player>)
	         */
	        
	    }
	    
	public static void sortComparebleEmp()
	{
		EmpComparable e1=new EmpComparable(100);
		e1.Name="Sam";
		EmpComparable e2=new EmpComparable(200);
		e2.Name="Musk";
		EmpComparable e3=new EmpComparable(300);
		e3.Name="Jobs";
		List<EmpComparable>empList=new ArrayList<>();
		empList.add(e2);
		empList.add(e3);
		empList.add(e1);
		//System.out.println(empList);
		Iterator<EmpComparable>emp_iterator=empList.iterator();
		while(emp_iterator.hasNext())
		{
			System.out.println(emp_iterator.next().getID());
		}
		Collections.sort(empList);//when we are passing collection it should be comparable
		System.out.println("----");
		emp_iterator=empList.iterator();
		while(emp_iterator.hasNext())
		{
			//System.out.println(emp_iterator.next().getID());
			EmpComparable emp=emp_iterator.next();
			System.out.println(emp.getID()+" "+emp.Name);
		
		}
		/*
		 * The method sort(List<T>) in the type Collections
		 * is not applicable for the arguments(ArrayList<Player>)
		 */
	}

}
