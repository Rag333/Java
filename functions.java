package lecture4;

import java.util.Scanner;
public class functions {
 public static int total(int a , int b) {
	 int total = a + b ;
	 return total ;	 
 }
 public static void main (String args[]) {
	 Scanner s = new Scanner(System.in);
	 System.out.println("enter 1 no: ");
	 int a = s.nextInt();
	 System.out.println("enter 2 no: ");
	 int b = s.nextInt();
	 total(a,b);
	 int total = total(a,b);
	 System.out.println(total);
	 
 }
}
