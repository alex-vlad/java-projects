package calc;

import java.util.Scanner;

public class Calculator {

	private static Scanner in;
	private static Scanner in2;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Insert the first number\n");
		double a = in.nextInt();
		System.out.println("Insert the second number\n");
		double b = in.nextInt();
    		calculate(a,b);
    }

	private static void calculate(double a, double b) {
		in2 = new Scanner(System.in);
		System.out.println("1:Add, 2:Substract, 3:Divide, 4:Multiply, 5:Factorial \nEntert now:\n");
		switch (in2.nextInt()) {
		case 1:
			System.out.println(Calcul.add(a, b));
			break;
		case 2:
			System.out.println(Calcul.substract(a, b));
			break;
		case 3:
			System.out.println(Calcul.divide(a, b));
			break;
		case 4:
			System.out.println(Calcul.multiply(a, b));
			break;
		case 5:
			Factorial factor= Calcul.fact(a, b);
			System.out.println("a:"+ factor.x1+","+"b:"+factor.x2);
			break;
		default:
			break;
		}
		
	}
	}
