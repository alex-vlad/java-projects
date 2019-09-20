package calc;

public class Calcul {
	public static double add(double a, double b){
		return a+b;
	}
	public static double substract(double a, double b){
		return a-b;
	}
	public static double divide(double a, double b){
		return a/b;
	}
	public static double multiply(double a, double b){
		return a*b;
	}
	public static Factorial fact(double a, double b){
		double temp_a = 1;
		double temp_b = 1;
		
		for (double i = a; i > 0; i--) {
			temp_a = temp_a * i;
		}
		
		for (double i = b; i > 0; i--) {
			temp_b = temp_b * i;
		}
		return new Factorial(temp_a,temp_b);
	
	}

}
class Factorial {
    public final double x1, x2;

    public Factorial(double x1, double x2) {         
        this.x1 = x1;
        this.x2 = x2;
    }
}
