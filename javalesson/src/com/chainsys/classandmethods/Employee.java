package com.chainsys.classandmethods;
/*
 * @author Leha3124
 * Date:25 Mar 2022
 */

public class Employee {
	private final int empID;
	private String name;
	private String city;
	private long salary;
	//contructor
	public Employee(int id)
	{
		this.empID=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name=name;
		}
	public int getEmpID()
	{
		return empID;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity() 
	{
		return city;
		}
	public void setSalary(long salary)
	{
		this.salary=salary;
		} 
	public long getSalary()
	{
		return salary;
	}

}
