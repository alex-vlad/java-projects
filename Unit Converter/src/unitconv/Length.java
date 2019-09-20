package unitconv;

public class Length extends Converter {
    private String[] units;
    private double[] unitConstants;
//Initialize constructor
    public Length() {
        units = new String[] {"km", "m", "cm", "mm"};

        unitConstants = new double[] {1000, 1, 0.01, 0.001};
    }
//Prints out information about length units
    public void unitsInfo() {
        System.out.println("Kilometer (km)");
        System.out.println("Meter (m)");
        System.out.println("Centimeter (cm)");
        System.out.println("Millimeter (mm)");
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