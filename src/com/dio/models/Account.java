package com.dio.models;

public class Account {

	private String agency;
	private String number;
	private double balance;
	private Client client;
	
	public Account() {
		
	}
	
	public void setAgency(String agency) {
		this.agency = agency;
	}
	
	public String getAgency() {
		return this.agency;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return this.number;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Client getClient() {
		return this.client;
	}
}
