package bankaccountapp;

import java.util.*;

public class BankAccountApp {

	public static void main(String[] args) {
		
		String file = "D:\\Java Projects Files\\NewBankAccounts.csv";
		
		/*
		Checking chkacc1 = new Checking("Jim Smith", "123456789", 1500);
		
		Savings savacc1 = new Savings("Shawn George", "987654321", 1000);
		
		chkacc1.showInfo();
		System.out.println("-------------------");
		savacc1.showInfo();
		
		*/
		
		List<Account> accounts = new LinkedList<Account>();
		
		// Read a CSV File then create new accounts based on that data
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.valueOf(accountHolder[3]);
//			System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);
			
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initDeposit));
			} 
			else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			} 
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}	
		}
		
		for(Account acc: accounts) {
			System.out.println("\n*****************");
			acc.showInfo();
		}
	}

}
