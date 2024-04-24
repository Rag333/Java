package sortNsearch;

import java.util.Scanner;

public class merge2sortA {
	public static int[] Merge2Sort( int[] arr , int[] arr2) {
		int Newarray[] = new int[arr.length + arr2.length];
		for( int i = 0 ; i < arr.length - 1; i++) {
			int key1 = arr[i];
			int j = 0 ;
		   while(j< arr2.length - 1) {
			   int key2 = arr2[j];
			   
		   }
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
		int B[] = {1,2,3,4};
		int manish[] = Merge2Sort( A, B );
		print(manish);
	}


}
