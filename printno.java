package Recursion;

public class printno {
	public static int pno(int n ) {
		if(n == 0 ) {
			return 0 ;
			
		}
		int Sum = n + pno( n-1);
		return Sum ;
}
 public static void main(String [] args) {
	 int no = pno(4);
	 System.out.println(no);
	 
 }
}
