package bintodec;

import java.util.Scanner;

public class BinDec {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer = null;
		do
		{
			System.out.print("1.Convert Decimal to Binary\n2.Convert Binary to Decimal\n" +
				"Enter an option : ");
			int choice = in.nextInt();
			if(choice == 1)
			{
				System.out.print("Enter the decimal value: ");
				int num = in.nextInt();
				System.out.println("The number in binary is " + decToBin(num));
			}
			else if(choice == 2)
			{
				System.out.print("Enter the binary value: ");
				String num = in.next();
				System.out.println("The number in decimal is " + binToDec(num));
			}
			else
			{
				System.out.println("Wrong input entered");
			}
			System.out.print("Do you want to try again?(y/n) : ");
			answer = in.next();
		}while(answer.equalsIgnoreCase("y"));
		in.close();
	}

	private static long binToDec(String num) {
		long dec = 0;
		for(int i=num.length()-1;i>=0;i--)
		{
			long power = (long) Math.pow(2.0, num.length()-i-1);
			dec+=(power*(num.charAt(i)-'0'));
		}
		return dec;
	}

	private static String decToBin(int num) {
		
		String bin = "";
		do
		{
			bin += num%2;
			num /= 2;
		}while(num>0);
		return bin;
	}
}