package com.account;

public class BankAccount {
	protected double checkingBalance = 0;
	protected double savingsBalance = 0;
	protected String checking;
	protected String savings;
	public static int totalAccounts = 0;
	private static double totalMoney = 0;
	
	public BankAccount(String checking, String savings) {
		this.checking = checking;
		this.savings = savings;
		totalAccounts++;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	public void addMoney(String account, double amount) {
		if (account == "checking") {
			checkingBalance += amount;
			totalMoney += amount;
		}else {
			savingsBalance += amount;
			totalMoney += amount;
		}
	}
	
	public void withdrawMoney(String account, double amount) {
		if (account == "checking" && checkingBalance > amount) {
			checkingBalance -= amount;
			System.out.println(String.format("Withdrew %s dollars", amount));
		}else if (account == "checking" && checkingBalance < amount) {
			System.out.println("Insufficient funds");
		}else if (account == "savings" && savingsBalance > amount) {
			savingsBalance -= amount;
		}else {
			System.out.println("Insufficient money.");
		}
	}
	
	public static double getTotal() {
		return totalMoney;
	}
}
