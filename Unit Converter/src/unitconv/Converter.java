package unitconv;

import java.util.Scanner;

public class Converter {
	private String fromUnit;
	private String toUnit;
	private double value;
	private Scanner in;
// Initialize the Converter
    public Converter() {
        this.in = new Scanner(System.in);
        this.fromUnit = "";
        this.toUnit = "";
        this.value = 0;
    }
 //return the unit the user wants to convert from
    public String getFromUnit() {
        return this.fromUnit;
    }
 //return the unit the user wants to convert to
    public String getToUnit() {
        return this.toUnit;
    }
//return the value the user wants to convert
    public double getValue() {
        return this.value;
    }
//Ask for conversion input
    public void userInput() {
        System.out.println("You want to convert from:");
        this.fromUnit = in.nextLine();
        System.out.print("to: ");
        this.toUnit = in.nextLine();
        System.out.print("The value is ");
        this.value = in.nextDouble();
    }
}