package week1.day2.assignments;

import java.util.Arrays;

public class ArrayMissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,4,7,6,8,10};

		// Sort the array	
		Arrays.sort(arr);

		// loop through the array (start i from arr[0] till the length of the array)
              for (int i =0; i <arr.length; i++) {
            	  if(arr[i]!=i+1) {
            		  System.out.println(arr[i]-1);
            		  
            		  break;
            	  }
				
			}
              
			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration
				
			
		
		
		
	}

}
