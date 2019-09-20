package unitconv;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer = null;
		//Looping as long as the input is "y"
		do {
		System.out.println("Convert:\n(1)Length\n(2)Mass\n(3)Speed\n(4)Temperature");
		int choice = in.nextInt();
		switch(choice) {
			case 1:
				Length val = new Length();
				val.unitsInfo();
				val.userInput();
				System.out.print(val.convert());
				break;
			case 2:
				Mass val1 = new Mass();
				val1.unitsInfo();
				val1.userInput();
				System.out.print(val1.convert());
				break;
			case 3:
				Speed val2 = new Speed();
				val2.unitsInfo();
				val2.userInput();
				System.out.print(val2.convert());
				break;
			case 4:
				Temperature val3 = new Temperature();
				val3.unitsInfo();
				val3.userInput();
				System.out.print(val3.convert());
				break;
			default:
				break;
		}
		System.out.println();
		System.out.print("Do you want to try again?(y/n) : ");
		answer= in.next();
		} while(answer.equalsIgnoreCase("y"));
		in.close();
			
	}

}
