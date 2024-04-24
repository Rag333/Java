package RecursionAndArray;

public class Sorted {
	public static  boolean sortedA(int arr[]) {
	 if(arr.length <= 1 ) {
		 return true ;
		 
	 }
	 if(arr[0] > arr[1]) {
		 return false ;
		 
	 }
	 int smallarr[] = new int[arr.length-1] ;
	 for( int i = 1 ; i < arr.length ; i++) {
		 smallarr[i-1]=arr[i] ;
		 
	 }
		
		boolean answer = sortedA(smallarr);
		return answer ;
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,7,1};
		boolean manish = sortedA(array);
		System.out.println(manish);
		
	}

}
