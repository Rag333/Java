package string;
import java.util.Scanner ; 
public class palindrome {
	public static void main(System args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		for(int i = 0 ; i < str.length(); i++) {
			int j = str.length() ;
		while(j >0) {
			if(str.charAt(i) == str.charAt(j)) {
			j-- ;
			
			
				
			}
			System.out.print("yes palindrome");
			
			}
			System.out.println("not palindrome");
		}
	}
}
