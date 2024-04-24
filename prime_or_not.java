package lecture2;

import java.util.Scanner;
public class prime_or_not {
public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	int d = 2 ;
	int n = scan.nextInt();
	
	while(d <= n-1) {
		if (n%d==0) {
		System.out.println("not prime ");
	}
		d = d +1 ;
		System.out.println("prime");
		}
}
}
