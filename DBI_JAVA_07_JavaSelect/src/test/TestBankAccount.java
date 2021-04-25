package test;

import domain.BankAccount;

public class TestBankAccount
{

	public static void main(String[] args)
	{
		BankAccount ba1, ba2, ba3, ba4;
		
		ba1 = new BankAccount("", -500.0);
		ba2 = new BankAccount("  ", 0.0);
		ba3 = new BankAccount(null, -0.0);
		ba4 = new BankAccount("Grabler", 500.5);
		
		
		System.out.println(ba1);
		System.out.println(ba2);
		System.out.println(ba3);
		System.out.println(ba4);
	}

}
