package ARRAY;
import java.util.Scanner; ;
public class UsingFunction_input {
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
		
	}

}
