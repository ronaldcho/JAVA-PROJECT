
package emailapp;

import java.util.Scanner;

public class Email {
		private String firstName;
		private String lastName;
		private String password;
		private String department;
		private int mailboxCapacity;
		private String alternateEmail;
		private int defaultPasswordLength = 15; // set default email length
		private String email;
		private String companySuffix = "company.com";  // define the company domain name
		
		// Constructor to receive the first name and last name
		public Email(String firstName, String lastName){
			this.firstName = firstName;
			this.lastName = lastName;
			System.out.println("EMAIL CREATED FOR USER : " + this.firstName + " " + this.lastName);
			
			// Call a method asking for the department, return the department
			this.department = setDepartment();
			System.out.println("Department : " + this.department);
			
			// Call a method that return a random password
			this.password = randomPassword(defaultPasswordLength);
			System.out.println("Your password is : " + this.password);
			
			// Combine elements to generate email
			//firstname.lastname@department.company.com
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
			System.out.println("Your email is : " + email);
		}
		
		// Ask for the department
		private String setDepartment(){
			System.out.print("DEPARTMENT CODES: \n 1 for Sales\n 2 for Developement\n 3 for Accounting\n 0 for none\nEnter department code: ");
			Scanner in = new Scanner(System.in);
			int deptChoice = in.nextInt();
			if (deptChoice == 1) { return "sales"; }
			else if (deptChoice == 2) { return "dev"; }
			else if (deptChoice == 3) { return "acct"; }
			else if (deptChoice == 0) { return "none"; } // 
			else { return ""; }
 		}
		// Generate a random password
		private String randomPassword(int length){
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~!@#$%^&*";
			char[] password = new char[length];
			for (int i=0; i<length; i++){
				int rand = (int) (Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(rand);
			}
			return new String(password);
		}
		
		// Set the mailbox capacity
		public void setMailboxCapacity(int capacity){
			this.mailboxCapacity = capacity;
		}
		
		// Set the alternate email
		public void setAlternateEmail(String altEmail){
			this.alternateEmail = altEmail;
		}
		
		// Change the password
		public void changePassword(String password){
			this.password = password;
		}
		
		// Get method to access the private variables
		public int getMailboxCapacity() { return mailboxCapacity; }
		public String getAlternateEmail() { return alternateEmail; }
		public String getPassword() { return password; }
		
		// To display the name, email, and mailbox capacity
		public String showInfo(){
			return " DISPALY NAME : " + firstName + " " + lastName +
					"\n COMPANY EMAIL: " + email +
					"\n MAILBOX CAPACITY : " + mailboxCapacity + "mb";
		}
		
}
