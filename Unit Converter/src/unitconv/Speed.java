package unitconv;

public class Speed extends Converter {
	private String[] units;
    private double[] unitConstants;
  //Initialize constructor
    public Speed() {
        units = new String[] {"mps", "kph"};
        unitConstants = new double[] {1, 0.27778};
    }
  //Prints out information about length units
    public void unitsInfo() {
    	  System.out.println("Meter/second (mps)");
          System.out.println("Kilometer/hour (kph)");
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