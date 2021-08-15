package week1.day2.assignments;

import java.util.Iterator;

import org.apache.poi.util.SystemOutLogger;

public class OddIndexToUpperacase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// * Declare String Input as Follow
		  
		  String test = "changeme";
		  
		 
		// * a) Convert the String to character array
		char[] charArr= test.toCharArray();
		// * b) Traverse through each character (using loop)
		for (int i = 0; i < charArr.length; i++) {
			String str;
			if((i%2==0)) {
				
				 str=String.valueOf(Character.toUpperCase(charArr[i]));
				System.out.println(str);
			}
			else {
				str=String.valueOf(charArr[i]);
				System.out.println(str);
			}
		}
		 
		// * c)find the odd index within the loop (use mod operator)
		 
		// * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  

	}

}
