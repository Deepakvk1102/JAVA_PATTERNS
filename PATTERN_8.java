package JAVA_PATTERN;
import java.util.Scanner;
public class PATTERN_8 {
	public static void main(String[]args){
		
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		//LOOP ONE
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i+1;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		//LOOP TWO
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i+1;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
