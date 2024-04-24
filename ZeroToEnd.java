package ARRAY;
import java.util.Scanner ; 
public class ZeroToEnd {
   public static int[] zero(int arr[]) {
	   int N = 0 ;
	   for (int i = 0 ; i < arr.length ; i++) {
		  if(arr[i] != 0 ) {
			  int temp = arr[i] ; 
			  arr[i] = arr[N] ;
			  arr[N] = arr[i];
			  
			  N++ ;
		  }
		   
	   }
	   return arr ;
	  
   }
   public static int[] ti() {
	   Scanner s = new Scanner(System.in);
	   int size = s.nextInt();
	   int arr[] = new int[size];
	   for(int i = 0 ; i < size ; i ++ ) {
		   arr[i] = s.nextInt();
	   }
	return arr ;   
   }
   public static void print(int arr[] ) {
	   for(int i = 0 ; i < arr.length ; i++) {
		   System.out.println(arr[i]);
	   }
}
   public static void main (String args []) {
	   int array [] = ti();
	   print(array);
	   int manish[] = zero(array);
	   print(manish);
	   
   }
}
