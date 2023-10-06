package com.atm;

public class BankAccount {
	private String accNo;
	private String accHolderName;
	private double bal;
	
	public BankAccount(String accNo, String accHolderName, double bal) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.bal = bal;
	}

	public String getAccNo() {
		return accNo;
	}
	
	public String getAccHolderName() {
		return accHolderName;
	}
	
	public double getBal() {
		return bal;
	}
	public void deposit(double amt) {
		bal += amt;
	}
	public boolean withdraw(double amt) {
		if (amt <= bal)
		{
			bal -= amt;
			return true;
		}
		return false;
	
	}

}
