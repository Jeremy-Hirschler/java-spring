package com.banktest;
import com.account.*;

public class BankTest {

	public static void main(String[] args) {
		BankAccount a = new BankAccount("checking", "savings");
		System.out.println(a.getSavingsBalance());
		System.out.println(BankAccount.totalAccounts);
		a.addMoney("checking", 5);
		a.addMoney("savings", 10.23);
		System.out.println(a.getCheckingBalance());
		a.withdrawMoney("checking", 3);
		System.out.println(BankAccount.getTotal());
	}

}
