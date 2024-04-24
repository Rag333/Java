package string;

public class charachterNstring {
	public static void  print(String s) {		
		for(int i = 0 ; i < s.length() ; i++) {
		 System.out.println(s.charAt(i));
		}
	}
	public static void main (String[] args) {
		String str = "mahipal singh" ; 
		print(str);
	}
	
}
