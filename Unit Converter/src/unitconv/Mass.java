package unitconv;

public class Mass extends Converter {
	private String[] units;
    private double[] unitConstants;
  //Initialize constructor
    public Mass() {
        units = new String[] {"ton", "kg", "g", "mg"};
        unitConstants = new double[] {1000, 1, 0.001, 0.000001};
    }
  //Prints out information about length units
    public void unitsInfo() {
    	System.out.println("Metric ton (ton)");
        System.out.println("Kilogram (kg)");
        System.out.println("Gram (g)");
        System.out.println("Milligram (mg)");
    }
  //Converts the unit
    public double convert() {
        String fromUnit = getFromUnit();
        String toUnit = getToUnit();
        double value = getValue();
        int fromIndex = 0;
        int toIndex = 0;

        for (int i = 0; i < units.length; i++) {
            if (units[i].equals(fromUnit)) {
                fromIndex = i;
            }

            if (units[i].equals(toUnit)) {
                toIndex = i;
            }
        }
        value = value * unitConstants[fromIndex] / unitConstants[toIndex];

        return value;
    }
}
