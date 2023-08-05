package emailapp;

import java.util.*;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String department;
	private String email;
	private int mailboxCapacity;
	private String alternateEmail;
	private String companySuffix = "xyztechnologies.com";
	
	//Constructor to receive the first name & last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is : " + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter department code: ");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		if(depChoice == 1) { return "sales";}
		else if(depChoice == 2) { return "dev"; }
		else if(depChoice == 3) { return "acct"; }
		else { return ""; }
		
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
	
	//Set the mailbox capacity
	
	//Set the alternate email
	
	//Change the password
	
}
