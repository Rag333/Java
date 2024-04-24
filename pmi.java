package Recursion;

public class pmi {
	public static int principal(int  n ) {
		if ( n == 1) {
			return 1 ;
			
		}
		int SumOfAll = principal(n-1);
		return SumOfAll*n ;
		
	}
	public static void main(String [] args) { 
		int no = principal(3);
		System.out.println(no);
		
		
	}

}
