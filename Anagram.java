package week1.day2.assignments;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	//*Declare a String 
	String text1 = "pos";
// *Declare another String
	String text2 = "sop"; 
// * a) Check length of the strings are same then (Use A Condition)
	if(text1.length()==text2.length()) {
 //* b) Convert both Strings in to characters
		char[] charArray = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		
		Arrays.sort(charArray);
		System.out.println(charArray);
		Arrays.sort(charArray2);
		System.out.println(charArray2);
		//String str1=charArray2.toString();
		//String str2=charArray.toString();

		if(charArray.equals(charArray2))
		{
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
		
 //* c) Sort Both the arrays
 //* d) Check both the arrays has same value
 //* 
}
}
}

