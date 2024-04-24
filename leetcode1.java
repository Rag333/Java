package lecture1;
import java.util.Scanner ;
public class leetcode1 {
	  public static void main(String args[])
	   { 
	    Scanner s = new Scanner(System.in);
	    int input = s.nextInt();
	    int count = 0 ;
	      while(input != 0){
	        if(input%2 == 0){
	           input = input/2 ;     
	           count++ ;
	           }
	           else {
	           input =   (input - 1) ;
	           count ++ ;
	           }
	      }
	      System.out.println(count);
	    }
}