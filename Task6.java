package jat5.org;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		methodHotelTariff();
	}
	public static void methodHotelTariff() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Month");
		int month = s.nextInt();
		System.out.println("Enter Rent Amount");
		float rent = s.nextFloat();
		System.out.println("Enter Number Days Stayed");
		int noOfDays = s.nextInt();
		s.close();
		double totalTariff;
		switch (month) {
		case 1:
			totalTariff = noOfDays*rent;
			System.out.printf("Total Tariff is %.2f",totalTariff);
			break;
		case 2:
			totalTariff = noOfDays*rent;
			System.out.printf("Total Tariff is %.2f",totalTariff);
			break;
		case 3:
			totalTariff = noOfDays*rent;
			System.out.printf("Total Tariff is %.2f",totalTariff);
			break;

		case 4:
			totalTariff = (noOfDays*rent)+(noOfDays*rent*0.2);
			System.out.printf("Total Tariff is %.2f",totalTariff);
			break;

		case 5:
			totalTariff = (noOfDays*rent)+(noOfDays*rent*0.2);
			System.out.printf("Total Tariff is %.2f",totalTariff);
			break;

		case 6:
			totalTariff = (noOfDays*rent)+(noOfDays*rent*0.2);
			System.out.printf("Total Tariff is %.2f",totalTariff);
			break;

		case 7:
			totalTariff = noOfDays*rent;
			System.out.printf("Total Tariff is %.2f",totalTariff);
			break;

		case 8:
			totalTariff = noOfDays*rent;
			System.out.printf("Total Tariff is %.2f",totalTariff);
			break;

		case 9:
			totalTariff = noOfDays*rent;
			System.out.printf("Total Tariff is %.2f",totalTariff);
			break;

		case 10:
			totalTariff = noOfDays*rent;
			System.out.printf("Total Tariff is %.2f",totalTariff);
			break;

		case 11:
			totalTariff = (noOfDays*rent)+(noOfDays*rent*0.2);
			System.out.printf("Total Tariff is %.2f",totalTariff);
			break;

		case 12:
			totalTariff = (noOfDays*rent)+(noOfDays*rent*0.2);
			System.out.printf("Total Tariff is %.2f",totalTariff);
			break;

		default:
			System.out.println("Enter Valid Month");
			break;
		}
	}
}

