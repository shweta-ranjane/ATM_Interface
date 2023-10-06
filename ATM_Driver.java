package com.atm;

import java.util.Scanner;

public class ATM_Driver 
{
	public static void main(String[]args) 
	{
		BankAccount acc = new BankAccount("123456","Shweta Ranjane", 1000.00);
		ATM_Interface atm = new ATM(acc);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("\n--**--ATM MENU--**--");
		System.out.println("\n1. CHECK BALANCE");
		System.out.println("2. DEPOSIT");
		System.out.println("3. WITHDRAW");
		System.out.println("4. EXIT");
		System.out.print("Select an option: ");
		
		int option= sc.nextInt();
		switch (option) {
		case 1:
		     atm.checkBal();
		     break;
		case 2:
			atm.deposit();
			break;
		case 3:
			atm.withdraw();
			break;
		case 4:
			atm.exit();
			break;
		default:
				System.out.println("Invalid Option. Please select valid option,");
		}
		
	}
		
	}

}
