package lecture3;
import java.util.Scanner ;
public class pattern1{
	public static void main(String[] args) {
		Scanner v= new Scanner(System.in);
		int n = v.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1 ;
			while (j<= n) {
			System.out.print("*");
			j=j+1;
			}
		System.out.println();
		i = i+1;
	}
	}

}
