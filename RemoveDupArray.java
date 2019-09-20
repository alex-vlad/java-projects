import java.util.Arrays;

public class RemoveDupArray {
    public static void main(String[] args) {

        int[] x = { 10, 20, 30, 40, 50, 50, 10, 20 };
        Arrays.sort(x);
       removeDuplicate(x);
    }
    private static void removeDuplicate(int[] x) {
    int current= x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] != current) {
            	System.out.print(" " + current);
                current = x[i];
            }
    }System.out.println(" " + current);
}
}