package studentdatabaseapp;

import java.util.*;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance;
	private static int id = 1000;
	private static int costOfCourse = 600;
	
	//Constructor: prompt user to enter student's name & year
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = sc.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = sc.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = sc.nextInt();
		
		setStudent();
	}
	
	//Generate an ID
	private void setStudent() {
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	//Enroll in courses
	public void enroll() {
		//Get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit) : ");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				break;
			}
		} while(1 != 0);
	}
	
	//View balance
	public void viewBalanace() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	//Pay tuition
	public void payTuition() {
		viewBalanace();
		System.out.print("Enter your payment: $");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for the payment of $" + tuitionBalance);
		viewBalanace();
	}
	
	//Show status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName + 
				"\nGrade Level: " + gradeYear + 
				"\nStudent ID: " + studentID + 
				"\nCourses enrolled: " + courses + 
				"\nBalance: " + tuitionBalance;
				
	}

}
