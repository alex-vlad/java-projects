import java.util.ArrayList;
import java.util.Scanner;

public class Fibo {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("How far to go?");
		int limit = in.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		while ((list.size())< limit) {
			if (limit==1) {
				break;
			}else if(list.size()==1) {
				list.add(1);
			}else {
				list.add(list.get(list.size()-1)+list.get(list.size()-2));
			}
		}System.out.println(list);
		in.close();
	}

}
