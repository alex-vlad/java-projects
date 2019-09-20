package emailApp;

import java.util.Scanner;

public class EmailApp {

	private static Scanner input;

	public static void main(String[] args) {
		Email em1 = new Email("Alex","Vlad");
		System.out.println(em1.info());
		String answer = null;
		do {
			System.out.println(" For changing password press 1\n For changing mailbox capacity press 2\n For setting an alternate mail press 3\n For info press 4.");
			input = new Scanner(System.in);
			int select = input.nextInt();
		    switch(select) {
		    case 1:
		    	Scanner inp= new Scanner(System.in);
		    	System.out.println("Enter your new password:");
		    	String pass = inp.nextLine();
		    	em1.changePass(pass);
		    	System.out.println(em1.info());
		    	break;
		    case 2:
		    	Scanner inp1= new Scanner(System.in);
		    	System.out.println("Enter your new capacity:");
		    	int capacity = inp1.nextInt();
		    	em1.setMailboxCapacity(capacity);
		    	System.out.println(em1.info());
		    	break;
		    case 3:
		    	Scanner inp2= new Scanner(System.in);
		    	System.out.println("Enter your new mail:");
		    	String altmail = inp2.nextLine();
		    	em1.setAltEmail(altmail);
		    	System.out.println(em1.info());
		    	break;
		    case 4:
		    	System.out.println(em1.info());
		    	break;
		    	}
		    System.out.println("Do you want to change anything else?(y/n)");
		    answer =input.next();
		    }while(answer.equalsIgnoreCase("y"));
	}

}
