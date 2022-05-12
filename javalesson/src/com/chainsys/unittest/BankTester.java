package com.chainsys.unittest;

import com.chainsys.variables.Bank;

public class BankTester {
	public static void testDeposit()
	{
		Bank.deposit(2000);

		System.out.println("Deposit amount:"+Bank.currentBalance);
	}

public static void testWithdraw()
{
	Bank.withdraw(3000);

	System.out.println("Withdraw amount:"+Bank.currentBalance);
}

public static void testOpenAccount()
{
	Bank.openAccount("Lekha",11938389);

	System.out.println("opening account for-"+Bank.Name+":Account Number="+Bank.accountNumber);
}
}

