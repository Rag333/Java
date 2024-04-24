package lecture2;

import java.util.Scanner;
public class even_addition_while {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter data:  ");
		int n = scan.nextInt();
		int s = 0 ;
		int i = 0 ;
		 
		while(i<=n) {
			if(i%2==0) {
				s=s+i;
			}
			i=i+1;
		}
		System.out.println(s);
	}
}
