package Recursion;

public class NumberOfDigit {
    public static int NoOf(int n ) {
    	if ( n ==1) {
    		return 1 ;
    		
    	}
    	int number = NoOf(n/10);
  
    	return number +1 ;
    }
    public static void main ( String [] args ) {
    	int Number = NoOf(12000);
    	System.out.println(Number);
    }
 
}
