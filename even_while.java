package lecture2;

import java.util.Scanner;
public class even_while {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the no : ");
		int n = scan.nextInt();
		int i = 0 ;
		
		while (i<= n) {
			if(i%2==0) {
				System.out.println(i);
			}
			i=i+1;
		}
	}

}
