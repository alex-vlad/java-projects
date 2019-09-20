package unitconv;

public class Temperature extends Converter {
	//Prints out information about length units
    public void unitsInfo() {
        System.out.println("Celsius (c)"); 
        System.out.println("Fahrenheit (f)");
        System.out.println("Kelvin (k)");
        System.out.println();
    }
  //Converts the unit
    public double convert() {
        String fromUnit = getFromUnit();
        String toUnit = getToUnit();
        double value = getValue();

        if (fromUnit.equals("c")) {
            value += 273.15;
        } else if (fromUnit.equals("f")) {
            value = (value - 32) * 5 / 9 + 273.15;
        }

        if (toUnit.equals("c")) {
            value -= 273.15;
        } else if (toUnit.equals("f")) {
            value = (value - 273.15) * 9 / 5 + 32;
        }

        return value;
    }
}
