
public class ReverseArray {
	public static void main(String[] args) {
		  int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		  int middle = array.length / 2;
		  int temp;
		  int j = array.length-1;
		  for (int i = 0 ; i < middle; i++, j--) {
		   temp = array[i];
		   array[i] = array[j];
		   array[j] = temp;
		  }
		  for(int a : array){
		   System.out.print(" "+a);
		  }
		 }
		}