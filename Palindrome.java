package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="malayalam";
		 /* a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String rev="";
		char[] charArray = str.toCharArray();
		
		int len=charArray.length;
		for (int i = charArray.length-1; i>=0; i--) {
			rev+=charArray[i];
			 
			
		}
		System.out.println(rev);

		if(str.equals(rev)) {
			System.out.println("Palindrome"); 
		 }
		 else {
			 System.out.println("Not Palindrome");
		 }
	}

}
