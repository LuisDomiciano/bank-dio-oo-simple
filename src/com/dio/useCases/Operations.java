package com.dio.useCases;

import com.dio.models.Account;

public class Operations {

	public double checkBalance(Account acc) {
		return acc.getBalance(); 
	}
	
	public void withdraw(Account acc, double amount) {
		if (!(acc.getBalance() > amount)) System.out.println("Saldo insuficiente");
		acc.setBalance(acc.getBalance() - amount);
	}
	
	public void deposit(Account acc, double amount) {
		acc.setBalance(acc.getBalance()+amount);
	}
}
