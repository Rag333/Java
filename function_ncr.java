package lecture4;

import java.util.Scanner;

public class function_ncr {
	public static int ncr(int n) {
		int ans = 1 ;
		for(int i = 1 ; i < n ; i ++ ) {
			ans = ans * i ;
		} 
		return ans ;
	}
 public static void main(System args []) {
	 Scanner s = new Scanner (System.in );
	int n = s.nextInt();
	int r = s.nextInt();
	ncr(n);
	ncr(r);
	ncr(n-r);
	int numerator =  ncr(n);
	int denominator = ncr(r)*ncr(n-r) ;
	int ncr = numerator/denominator ;
	System.out.println(ncr);
	
 }
}

