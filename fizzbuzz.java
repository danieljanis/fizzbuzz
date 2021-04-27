// Daniel Janis
// fizzbuzz implementation in Java

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner myInput = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num = myInput.nextInt();
		String returned = fizzBuzz(num);
		while (returned != "neither") {
		    System.out.println(returned);
		    System.out.println("Please enter a number:");
		    num = myInput.nextInt();
		    returned = fizzBuzz(num);
		}
		System.out.println("That number is not a multiple of 5 or 7, terminating...");
	}
	
	private static String fizzBuzz(int i) {
		// Number is a multiple of 5 and 7, say fizzbuzz
		if (((i % 5) == 0) && ((i % 7) == 0)) {
			return "fizzbuzz";
		}
		// Number is ONLY a multiple of 5
		else if ((i % 5) == 0) {
			return "fizz";
		}
		// Number is ONLY a multiple of 7
		else if ((i % 7) == 0) {
			return "buzz";
		}
		// Number is NOT a multiple of 5 or a multiple of 7
		else {
			return "neither";
		}
	}
}
