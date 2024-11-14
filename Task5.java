package jat5.org;
//Anna University Grading System
//The newly appointed Vice-Chancellor of Anna University wanted to create an automated grading system for the students to check their grade. When a student enters a mark, the grading system displays the corresponding grade. Write a program to solve the given problem. The grades for marks 100 - S, 90-99 is A, 80-89 is B, 70-79 is C, 60-69 is D, 50-59 is E and less than 50 is F.
//Input format:
//The input consists of one integer which corresponds to the marks scored by the student
//Output format:
//If a student marks greater than 100, print "Invalid Input". Otherwise, print the grade.
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		methodForGrading();
	}
	public static void methodForGrading() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Marks");
		int mark = s.nextInt();
		s.close();
		if (mark>100||mark<0) {
			System.out.println("Invalid Input");
		}
		else {
			if (mark==100) {
				System.out.println("S");
			}
			else if (mark>=90) {
				System.out.println("A");
			}
			else if (mark>=80) {
				System.out.println("B");
			}
			else if (mark>=70) {
				System.out.println("C");
			}
			else if (mark>=60) {
				System.out.println("D");
			}
			else if (mark>=50) {
				System.out.println("E");
			}
			else {
				System.out.println("F");
			}
		}
	}
}

