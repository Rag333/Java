package lecture2;

import java.util.Scanner;
public class While_loop {
public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the last limit no ");
	int n = scan.nextInt();
	int i = 1;
	while(i<=n) {
		System.out.println(i);
		i = i+1 ;
		
	}
	
	
}
}
