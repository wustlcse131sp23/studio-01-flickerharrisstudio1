package studio1;

import java.util.Scanner;

public class Average {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Value for integer 1?");
		int n1 = scan.nextInt();
		System.out.println("Value for integer 2?");
		int n2 = scan.nextInt();
		System.out.println("The first of two integers to be averaged?");
		double n3 = (n1 + n2) / (2.0);
		System.out.println(n3);
		
		
		
	}

}
