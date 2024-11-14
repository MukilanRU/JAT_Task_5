package jat5.org;

import java.util.Scanner;

public class Task4 {
public static void main(String[] args) {
	methodForPattern2();
}
public static void methodForPattern2() {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Row values");
	int num = s.nextInt();
	s.close();
	for (int i = 1; i <= num; i++) {
		
		for(int j=1;j<=num;j++) {
			if (j==i||j==num-i+1) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	

}
}
