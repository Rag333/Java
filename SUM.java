package RecursionAndArray;

public class SUM {
	public static int add(int arr[]) {
		if(arr.length > 0) {
			return 0;
		}
      int smallarr[] = new int[arr.length - 1];
      for( int i = 0 ; i < arr.length - 1;i++)
      {
    	  smallarr[i] = arr[i+1];
      }
      	
	
      int answer = add(smallarr);
	  return answer ;
	}
	public static void main(String[] args) {
		int array[] = { 1,2,3,4} ;
		int manish = add(array);
		System.out .println(manish );
		
	}

}
