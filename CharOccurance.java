package week1.day2.assignments;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";

		// declare and initialize a variable count to store the number of occurrences
		int count=0;
		// convert the string into char array
			char[] charArray = str.toCharArray();
		//get the length of the array
			int size=charArray.length;
		// traverse from 0 till the array length 
			for (int i = 0; i < charArray.length; i++) {
			
				if(str.charAt(i)==charArray[i]) {
					count++;
				}
			}
			// Check the char array has the particular char in it 
		
			// if is has increment the count
				 System.out.println(count);
			
			// print the count out of the loop
	}

}
