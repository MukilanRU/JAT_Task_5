package jat5.org;
//Write a program that reads in a string from the user and uses a loop to reverse the order of the characters in the string. Then, output the reversed string.
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		methodForReverse();
	}
	public static void methodForReverse() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the String");
		String str1 = scan.nextLine();
		scan.close();
		String revStr="";
		System.out.println("The Entered String Value is \"" +str1+ "\"");
		for (int i = str1.length()-1; i >=0; i--) {
			revStr+=str1.charAt(i);
		}
		System.out.println("The Reversed String Value is \"" +revStr+ "\"");
	}
}
