package week1.day2.assignments;

import java.util.Arrays;

public class SecondLargestEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] data = {3,2,11,4,6,7};

		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 
		 2) Pick the 2nd element from the last and print it
		 */

  Arrays.sort(data);
  int size=data.length;
  int secondLargest=data[size-2];
  
  System.out.println(secondLargest);
  
		
	}

}
