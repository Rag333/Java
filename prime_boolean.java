package lecture4;

import java.util.Scanner;
public class prime_boolean {
	public static boolean Isprime(int n ) {
		int a = 2 ;
		for (a=2; a<n ; a++) {
			if (n%a == 0) {
					return false ;
			}
			
		}
		return true ;
	}
	public static void prime (int n ) {
	
	for( int i = 1 ;i < n ; i++  ) {
		boolean Isprime = Isprime(i);
		if(Isprime) {
			System.out.println(i);
		}
		
	}
	}
	public static void main (String args[]) {
	Scanner s = new Scanner(System.in);	
	System.out.println("enter the no of prime no u want to print :  ");
	int n = s.nextInt();
	 prime(n);
	}
	
	

}
