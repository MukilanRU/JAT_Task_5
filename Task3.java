package jat5.org;

import java.util.Scanner;

//Q3)Write a program to print the given below pattern.
//Sample Input:
//4
//Sample Output:
//1
//2 3
//4 5 6
//7 8 9 10

public class Task3 {
public static void main(String[] args) {
	methodForPattern1();
}
public static void methodForPattern1() {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter no of rows");
	int a=s.nextInt();
	s.close();
	int num=1;
for (int i = 1; i <=a; i++) {
	for (int j = 1; j <=i; j++) {
		System.out.print(num+" ");
		num++;
	}
	System.out.println();
}
}
}
