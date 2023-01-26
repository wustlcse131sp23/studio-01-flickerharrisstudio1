package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your names: ");
		String name1 = scan.nextLine();
		String name2 = scan.nextLine();
		String name3 = scan.nextLine();
		String name4 = scan.nextLine();
		System.out.print("Greetings"+ " " + name1 + ", " + name2 + ", " +  name3 + ", and " +  name4 + ".");
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
