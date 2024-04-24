package lecture3;

public class slide {
	public static void main(String []args) {
		int n = 5 ;
		int i = 1 ;
		while(i <n ) {
			int space = 1 ;
			while(space < n-i) {
				System.out.print(" ");
				space++ ;
				
			}
			int j =1 ;
			while(j < i ) {
				System.out.print(j);
				j++ ;
				
				
			}
			i++ ;
			System.out.println();
		}
	}
}
