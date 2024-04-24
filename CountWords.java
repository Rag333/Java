package string;
import java.util.Scanner ; 
//RULE : must be one space after one word 
public class CountWords {
	public static int count(String str) {
		int count1 = 0 ;
		for (int i = 0 ; i < str.length(); i ++) {
			
		if(str.charAt(i) == ' '){
			count1 ++ ;
			
		}
		
		}
		count1 ++ ;
		return count1;
	
		
	}
	public static void main(String  args []) {
		Scanner  s = new Scanner (System.in );
		String str = s.nextLine();
		System.out.println("total no of words : "+ count(str));
		
		
	}

}
