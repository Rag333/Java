package ARRAY;

import java.util.Scanner;

public class secondL {
	public static int secondmax(int arr[]) {
		int max = Integer.MIN_VALUE;
		int SL = Integer.MIN_VALUE ;
		for(int i = 0 ; i <arr.length ; i++) {
			if(max < arr.length) {
				SL = max ; 
				max = arr[i];
				
			}
			else if(SL< arr[i] && arr[i] != max ) {
				SL = arr[i];
			}
		}
		return SL ;

	}
	public static int maximum(int arr[]) {
		int max = Integer.MIN_VALUE;
		for( int i= 0 ; i < arr.length ; i++) {
		if (arr[i] > max) {
			max = arr[i];
			
		}
			
		}
		return max ;
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
	   public static void main (String args[]) {
		   int array[] = ti();
		   print(array);
		   int max = maximum(array);
		   System.out.println(max);
		   int second = secondmax(array);
		   System.out.println(second);
		   
	   }

}
