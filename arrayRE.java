package twoDArray;
import java.util.Scanner ;
public class arrayRE {
	public static int[] taking() {
		Scanner s = new Scanner(System.in);
	System.out.println("enter the size of the array : ");
	int size = s.nextInt();
	int arr[] = new int[size];
	for ( int i = 0 ; i < size ; i++) {
		 arr[i] = s.nextInt();
		
	}
	return arr ;
	}
	public static void print(int arr[]) {
		int size = arr.length;
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
			
		}
	}
	public static void main( String[] args) {
		int manish[] = taking();
		print(manish);
	}
 
}

