package ARRAY;
import java.util.Scanner;
public class Array_intro {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the size :   ");
		int size = s.nextInt();
		int A[] = new int[size];
		for(int i =0 ; i < size ; i++) {
			A[i] = s.nextInt();			
			
		}
		for(int i = 0 ; i < size ; i ++ ) {
			System.out.println(A[i]);
			
		}
		System.out.println();

	}
	
}
