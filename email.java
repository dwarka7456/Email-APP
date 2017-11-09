package EmailApp;

import java.util.Scanner;

public class email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity;
	private String alternateEmail;
	
	//Constructor to receive the first and last name
	public email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
	//call method asking for the department - return department	
		this.department = setDepartment();
		System.out.println("Department Selected: " + this.department);
		
	//Call a method that returns a random password
	this.password = randomPassword(8);
	System.out.println("Your Password is :  " + this.password);
	}
	
	//Ask for the department 
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "Sales";}
		else if (depChoice == 2) { return "Dev";}
		else if (depChoice == 3) { return "Accounts";}
		else { return "";}
	}
	
	//Generate a random password
	@SuppressWarnings("unused")
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);	
		}
		return new String(password);
	}
	//set the mailbox capacity
	
	//set the alternate email
	
	//change the password

}
