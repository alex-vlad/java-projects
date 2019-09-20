import java.awt.Toolkit;
import java.util.Scanner;

public class Alarm {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("What unit of time do you want to use?\n (1) Hours\n (2) Minutes\n (3) Seconds\n (4) Combination");
		int n = in.nextInt();
		setTime(n);
		in.close();
}
	public static void sound() {
		//setting up number of beeps
	for(int i=0; i < 10; i++) {
		// using default sound as alarm
		Toolkit.getDefaultToolkit().beep();
		//delay between beeps
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
	}
	public static void alarm(int t) {
		System.out.printf("Alarm will start in "+ Integer.toString(t));
		try {
			Thread.sleep(t*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sound();
}
	//setting up the timer for the alarm
	public static void setTime(int user_input) {
		Scanner in = new Scanner(System.in);
		switch(user_input) {
		case 1:
			System.out.println("Hours: ");
			int n=in.nextInt();
	        int t=(n*60)*60;
	        alarm(t);
	        break;
		case 2:
			System.out.println("Minutes: ");
			int n1=in.nextInt();
	        int t1=n1*60;
	        alarm(t1);
	        break;
		case 3:
			System.out.println("Seconds: ");
			int n11=in.nextInt();
	        alarm(n11);
	        break;
		case 4:
			System.out.println("Hours: ");
			int h=in.nextInt();
			System.out.println("Minutes: ");
			int m=in.nextInt();
			System.out.println("Seconds: ");
			int s=in.nextInt();
	        int t11=(h*60)*60+m*60+s;
	        alarm(t11);
	        break;
		}in.close();
}
}
