
package ARRAY ;
import java.util.Scanner;

public class selectionSort {
	public static int Ls(int arr[],int value) {
		System.out.println("the no found at position");
	    for (int i = 0 ; i < arr.length  ; i++) {
	    	if(arr[i]==value) {
	    		return i ; 
	    	}
	    }
		System.out.println("not found ");
	    return -1 ;
	   
	}

	public static int maximum(int arr[]) {
		int max = Integer.MIN_VALUE;
		int size = arr.length;
		for(int i = 0 ; i < size ; i++) {
			if(arr[i]> max) {
				max = arr[i] ; 
			}
			
		}
		return max ; 
		
	}
	
	public static int[] ti() {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the size :  ");
		int size = s.nextInt();
		System.out.println("enter the nos u want to store : ");
		int arr[] = new int [size];
		for (int i=0 ;i< size ; i++ ) {
			arr[i]= s.nextInt();
			
		}
		return arr;
	}
    public static void print( int arr[]) {
       int size = arr.length;
	  for(int i=0 ; i< size ; i++) {
		  System.out.println(arr[i]);
	   }
    }
   public static void main ( String[] args) {
	  int array[] = ti();
	  print(array);
	  int max = maximum(array);
	  //System.out.println("the largest no is : ");
	  //System.out.println(max);
	  int Linearsearching = Ls(array,5);
	  System.out.println(Linearsearching);
	}
}

