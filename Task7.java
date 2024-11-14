package jat5.org;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		methodForLargerNumber();
	}
	public static void methodForLargerNumber() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number one :");
		int num1=s.nextInt();
		System.out.println("Enter Number Two :");
		int num2=s.nextInt();
		System.out.println("Enter Number Three :");
		int num3=s.nextInt();
		s.close();
		if (num1>=num2&&num1>=num3) {
			System.out.println("The Number "+num1+" is Greater than the other numbers");	
		}else if (num2>=num1&&num2>=num3) {
			System.out.println("The Number "+num2+" is Greater than the other numbers");
		}
		else {
			System.out.println("The Number "+num3+" is Greater than the other numbers");
		}
	}
}
