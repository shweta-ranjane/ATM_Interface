package com.atm;

import java.util.Scanner;

public class ATM implements ATM_Interface{
	private BankAccount bankAccount;
	
	public ATM(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	@Override
	public void checkBal() 
	{
		System.out.println("Account Holder: "+ bankAccount.getAccHolderName());
		System.out.println("Account Number: "+ bankAccount.getAccNo());
		System.out.println("Current Balance: "+ bankAccount.getBal());
		
	}
	@Override
	public void deposit() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount to deposit: Rs. ");
		double amount = sc.nextDouble();
		if(amount > 0) 
		{
			bankAccount.deposit(amount);
			System.out.println("Amount Deposited: Rs. "+amount);
			checkBal();
		}
		else {
			System.out.println("Inavalid deposit amount");
		}
		
	}
	@Override
	public void withdraw() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount to withdraw: ");
		double amount = sc.nextDouble();
		if(amount > 0) {
			if(bankAccount.withdraw(amount)) {
				System.out.println("Withdrawn: Rs. "+amount);
			}
			else {
				System.out.println("Insufficient Balance");
			}
			checkBal();
		}
			else {
				System.out.println("Invalid withdrawal amount");
			}
	}
	@Override
	public void exit() 
	{
		System.out.println("Exiting the ATM. Thank You");
		System.exit(0);	
	}
}
