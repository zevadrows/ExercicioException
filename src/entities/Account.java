package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Account(int number, String holder, double balance, double withdrawLimit) {
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;		
	}
	
	public void withDraw(double amount) {
		if (amount > withdrawLimit) {
			throw new IllegalArgumentException("The amount exceeds withdraw limit");
		}
		else if (amount > balance) {
			throw new IllegalArgumentException("Not enough balance");
		}
		else {
			balance -= amount;
		}
	}
	

}
