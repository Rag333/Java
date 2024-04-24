package sortNsearch;

import java.util.Scanner ;
public class binary_search {
		public static int bS(int [] arr, int key ) {
			int start = 0;
			int end = arr.length - 1;
			while(start <= end) {
				int mid = start + end /2 ;
				if( key  == arr[mid]) {
				return mid ;
					
				}
				else if ( key > arr[mid]) {
					start = mid+1; 
					
				}
				else {
				
					end  = mid - 1 ;
					
				}
			}
			return -1 ;
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
			int element = bS( A , 6 );
			System.out.println(element);
			
		}

	}

