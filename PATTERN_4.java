package JAVA_PATTERN;
import java.util.Scanner;
public class PATTERN_4 {
	public static void main(String[]args){
		
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i+1;j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}
}
