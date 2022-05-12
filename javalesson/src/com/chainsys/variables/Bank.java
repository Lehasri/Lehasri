package com.chainsys.variables;
/*@author Leha3124
 * @Date:25 Mar 2022
 */
public class Bank {
	public static int currentBalance;
	public static String Name;
	public static int accountNumber;
	public static void deposit(int amount)
	{
		currentBalance=amount+currentBalance;
		System.out.println(amount+" ");
	}
public static void withdraw(int amount)
{
	currentBalance=amount-currentBalance;
	System.out.println(amount+" ");

}
public static void openAccount(String name,int AccountNumber)
{
	Name=name;
	accountNumber=AccountNumber;
	System.out.println(Name+" "+accountNumber);

}
}
