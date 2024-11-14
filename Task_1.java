package jat5.org;
//Write a program to check whether a given string is a palindrome or not using for loop and if-else statement.
public class Task_1 {
	public static void main(String[] args) {
		methodPallindrome();
	}
	public static void methodPallindrome() {

		String str1 = "Race Car",revStr="";
		 String cleanedStr = str1.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		//revStr1=new StringBuilder(str1).reverse().toString();
		for (int i = cleanedStr.length()-1; i >= 0; i--) {
			revStr+=cleanedStr.charAt(i);
		}
		//System.out.println(revStr);

		if (cleanedStr.equals(revStr)) {
			System.out.println("The String \""+str1+"\" is Pallindrome");	
		}
		else {
			System.out.println("The String \""+str1+"\" is not Pallindrome");
		}
	}
}
