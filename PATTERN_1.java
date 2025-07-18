package JAVA_PATTERN;
import java.util.Scanner;
public class PATTERN_1 {
	public static void main(String[]args){
		
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=0;j<=a;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
