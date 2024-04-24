package lecture1;

import java.util.Scanner;
public class largest_of_three {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the  three nos to check :) :       ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a>=b && a>=c) {
			System.out.println(a);
		}
		else if(b>=a && b>=c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	
    
		System.out.print("is the largest no ");
	}
}
