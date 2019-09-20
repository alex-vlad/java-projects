package emailApp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String email;
	private String department;
	private int mailboxCapacity=500;
	private int passlen=9;
	private String alternateEmail;
	private String company="company.com";
	private Scanner in;
	
	//Get first and last name
	public Email(String firstname, String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
		System.out.println("EMAIL CREATED");
		
		//Method for department
		this.department=setDepartment();
		
		//Return random password
		this.password=randomPass(passlen);
		
		this.email= firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+company;
	}
	
	// Ask for deparment
	private String setDepartment() {
		System.out.println("Enter department:\n 1 for Sales\n 2 for Development\n 3 for Accounting\n 0 for none");
	    in = new Scanner(System.in);
	    int choice=in.nextInt();
	    switch(choice) {
	    	case 1:
	    		return "sales";
	    	case 2: 
	    		return "dev";
	    	case 3:
	    		return "acct";
	    	default: 
	    		return "";
	}
	}
	
	//Generate password
	    private String randomPass(int length){
	    	String passwordSet="ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789";
	    	char[] password = new char[length];
	    	for(int i=0; i<length;i++) {
	    		int rand = (int)(Math.random()*passwordSet.length());
	    		password[i]= passwordSet.charAt(rand);
	    	}
	    	return new String(password);
	    }
	//Set mailbox capacity
	    public void setMailboxCapacity(int capacity) {
	    	this.mailboxCapacity=capacity;
	    }
	
	//Set alternate email
	public void setAltEmail(String altmail) {
		this.alternateEmail=altmail;
	}
	//Change password
	public void changePass(String pass) {
		this.password=pass;
	}
	public int getMailboxCapacity() {
		return this.mailboxCapacity;
	}
	public String getAltMail() {
		return this.alternateEmail;
	}
	public String getPass() {
		return this.password;
	}
	public String info(){
		return "Display Name: " + firstname+" "+ lastname+
				"\nCompany email: " + email+
				"\nMailbox: " + mailboxCapacity+
				"\nPassword is: " + password+
				"\nAlternate mail: " + alternateEmail;
	}
}

