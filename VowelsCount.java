
public class VowelsCount {
	private static int a,e,i,o,u=0;

	public static void main(String[] args) {
		String str="java is cool";
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)=='a') {
				a++;
			}if(str.charAt(i)=='e') {
				e++;
		   }if(str.charAt(i)=='i') {
			   i++;
			   }
		   if(str.charAt(i)=='o') {
			   o++;
			   }
		   if(str.charAt(i)=='u') {
			   u++;
}

}System.out.println("a:" +a);
System.out.println("e:" +e);
System.out.println("i:" +i);
System.out.println("o:" +o);
System.out.println("u:" +u);}}