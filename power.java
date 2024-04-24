package Recursion;

public class power {
	public static int Pow(int n , int x ) {
		if ( n == 0 ) {
			return 1 ; 
		}
		int powerof =  Pow(n-1,x) ;
		return powerof *x  ;
	}
	public static void main( String[] args) {
		int powno = Pow(2,3);
		System.out.println(powno);
		
		
	}

}
