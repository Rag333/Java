package Recursion;

public class fibonacci {
	public static int fib(int n ) {
		if( n==0 || n==1) {
			return n ;
		}
	 
		return fib(n-1)+fib(n-2) ;
	}
	public static void main( String [] args ) {
	 int fibnum = fib(8);
	 System.out.println(fibnum);
		
	}

}
