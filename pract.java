package week1.day2.assignments;

public class pract {
	
	//staic int=0;
	
	/*
	 * public static String printString() {
	 * System.out.println("Test to call string"); return "";
	 * 
	 * } public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * String s="Java Quiz"; System.out.println(s.charAt(s.toUpperCase().length()));
	 * 
	 * 
	 * printString();
	 * 
	 * }
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
//		System.out.println(args[1]+args[2]+args[4]);
		String x="hi hi";
		char[] charArray = x.toCharArray();
		String[] split = x.split(" ");
		for (int i =0 ; i<=split.length-1; i++) {
			if(i%2==0) {
				for (int j = split.length-1; j >=0; j--) {
					System.out.println(split[i]);
				}
			}
			System.out.println(charArray[i]);
		}
	
		}	
}
