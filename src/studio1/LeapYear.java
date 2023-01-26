package studio1;

import java.util.Scanner;


public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Year?");
		int z = scan.nextInt();
		boolean isOrdered = ((z % 4 == 0)&&(z % 100!= 0))||(z % 400 == 0);
		System.out.println(z + " is a leap year:" + " " + isOrdered);


	}

}
