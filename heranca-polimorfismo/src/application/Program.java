package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(100, "Nicolas", 0.0);
		BusinessAccount bacc = new BusinessAccount(101, "Maria", 0.0, 500.0);
		
		//Upcasting
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(102, "Felipe", 0.0, 200.0);
		Account acc3 = new SavingsAccount(103, "Ana", 0.0, 0.01);
		
		//Downcasting
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.00);
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(100.00);
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
	}

}
