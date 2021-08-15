package week1.day2.assignments;

import java.util.Iterator;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// * Declare the input as Follow
	      		String test = "I am a software tester"; 
		//a) split the words and have it in an array
	      		String[] split = test.split(" ");
	//	b) Traverse through each word (using loop)
	      		for (int i = 0; i < split.length; i++) {
					if((!(i%2==0))) {
					 	for (int j = split.length-1; j >=0; j--) {
							System.out.println(split[j]);
						}
					}
					
				}
		//c) find the odd index within the loop (use mod operator)
		
		//d)split the words and have it in an array
		
		//e)print the even position words in reverse order using another loop (nested loop)
		//f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		
	}

}
