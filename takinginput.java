package twoDArray;

import java.util.Scanner ;
public class takinginput {
	public static int[][] TakingI(){
		Scanner s = new Scanner(System.in) ;
		int m = s.nextInt();
		int n = s.nextInt();
		int arr[][] = new int [m][n] ;
		for( int i = 0 ; i < arr.length ; i ++ ) {
			for( int j = 0 ; j < arr.length ; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		return arr ;
	}
	public static void print( int[][] arr) {
		for( int i = 0 ; i < arr.length; i ++ ) {
			for ( int j = 0 ; j < arr[0].length ; j++) {
				System.out.println(arr[i][j]);
			}
			
		}
		
	}
	public static void main(String [] args) {
		int array[][] = TakingI();
		print(array);
	}

}
