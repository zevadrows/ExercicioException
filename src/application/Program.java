package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data:");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial Balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			Account ac = new Account(number, holder, balance, withdrawLimit);
			System.out.println();

			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			ac.withDraw(amount);
			System.out.printf("New balance: %.2f", ac.getBalance());
		} catch (IllegalArgumentException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error!");
		}

		sc.close();

	}

}
