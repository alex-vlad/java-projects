
public class LargestElem {
	public static void main(String[] args) {
		  int[] array = {12,34,56,12,13,454};
		        usingIterative(array);
		 }
		 
		 private static int usingIterative(int[] array){
		        int max = array[0];
		        for (int i = 1; i <array.length; i++){
		            if (array[i] > max){
		             max = array[i];
		            }
		        }
		        System.out.println(max);
		        return max;
		 }
}
