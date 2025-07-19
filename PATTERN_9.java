package JAVA_PATTERN;
import java.util.Scanner;
public class PATTERN_9 {
	public static void main(String[]args){
		
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print(1 + " ");				
					}else {
						System.out.print(0 + " ");				

					}
			}
			System.out.println(" ");
		}
	}
}
