package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("the first integer to be averaged");
		int n1 = in.nextInt();
		System.out.print("the second integer to be averaged");
		int n2 = in.nextInt();
		double average = ((n1 + n2)/2);
		System.out.print("the average is" + average);
		// TODO Auto-generated method stub

	}

}
