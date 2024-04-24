package ARRAY;

import java.util.Scanner;

public class rotateARRAY {
	public static int[] rotate (int arr[],int d) {
		Scanner s = new Scanner (System.in);
		for( int i = d ; i <arr.length ; i++ ) {
			arr[i] = arr[i + d] ;
		}
		return arr ;
	}
	
	public static int[] taking_input() {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the size sir:  ");
		int size = s.nextInt();
		System.out.println("enter the nos -----");
		int arr[] = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = s.nextInt();
		}
		return arr ; 
		
	}
	public static void print(int arr[]) {
		System.out.println("the nos are :    ");
		int size = arr.length ;
		for(int i = 0 ; i < size ; i++) {
			System.out.println( arr[i]);	
		}
	}
	public static void main (String[] args) {
		int A[] = taking_input();
		print(A);
		int M[]= rotate(A,2);
		print(M);
		
	}


}
