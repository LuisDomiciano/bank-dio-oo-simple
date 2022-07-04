package com.dio.program;

import com.dio.models.Account;
import com.dio.models.Client;
import com.dio.useCases.Operations;

public class Run {

	public static void main (String []args) {
		
		Client c = new Client();
		c.setCpf("361.362.163-32");
		c.setEmail("evandro@gmail.com");
		c.setName("Evandro Gomes");
		
		Account acc = new Account();
		acc.setAgency("1423");
		acc.setNumber("902-5");
		acc.setBalance(0);
		acc.setClient(c);
		
		Operations op = new Operations();
		System.out.println(op.checkBalance(acc));
		op.deposit(acc, 1200.0);
		System.out.println(op.checkBalance(acc));
		op.withdraw(acc, 400);
		System.out.println(op.checkBalance(acc));
	}
}
