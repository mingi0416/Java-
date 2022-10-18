package com.human.ex20221018;

public class Account {

	private String owner;
	private long balance;
	
	Account(String owner, long balance){
		this.owner = owner;
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac1 = new Account("김민기", 0);
		ac1.deposit(50000);
		System.out.println(ac1.toString());
		ac1.withdraw(30000);
		System.out.println(ac1.toString());
		ac1.withdraw(50000);
		System.out.println(ac1.toString());
		
	}

	public String toString() {
		return String.format("%s 이름 %d 잔고", owner, balance);
	}
	
	public long deposit(long amount) {
		balance += amount;
		return balance;
		
	}
	
	public long withdraw(long amount) {
		if(balance>=amount) {
		balance -= amount;
		return balance;
		}
		else if(balance<amount){
		System.out.println("출금하려는 금액이 잔고보다 많습니다.");	
		}
		return balance;
	}
	

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
}
