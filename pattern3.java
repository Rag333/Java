package lecture3;

public class pattern3 {
 public static void main (String[] args) {
	 int n = 4 ;
	 int i = 1 ;
	 int val = 1;
	 while( i <= n) {
		 int space = 1 ;
		 int j = 1 ;
		 while( space <= n-i) {
			 System.out.print(" ");
			 space++ ;
		 }
		 while( j <= i ) {
			 System.out.print(val);
			 val ++ ;
			 j ++ ;
			 
		 }
		 System.out.println( );
		 i ++ ;
	 }
	
 }

}
