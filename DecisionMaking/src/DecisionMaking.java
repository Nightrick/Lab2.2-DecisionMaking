import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {

		String cycle;

		Scanner scnr = new Scanner(System.in);

		System.out.print("Hello there! Please enter your name: ");

		String userName = scnr.next();

		System.out.println("Thank you " + userName + "!");

		do {
			System.out.print("Please enter an integer between 1 and 100: ");

			int userInput = scnr.nextInt();

			if (!(userInput >= 1 && userInput <= 100)) {
				do {
					System.out.println("Error! Please enter a valid number!");

					System.out.print("Please enter an integer between 1 and 100: ");

					userInput = scnr.nextInt();
				} while (!(userInput >= 1 && userInput <= 100));
			}

			if (!(userInput % 2 == 0)) {
				if (userInput < 60) {
				System.out.println(userName + ", you entered " + userInput + ". Odd.");
				} else if (userInput > 60) {
					System.out.println("Wow, " + userName + "! You entered " + userInput + ". Odd and over sixty!");
				}
			} else {
				if (userInput >= 2 && userInput <= 25) {
					System.out.println(userName + ", that number was even and less than 25.");
				} else if (userInput >= 26 && userInput <= 60) {
					System.out.println(userName + ", " + userName + ", " + userName + "... That number was even.");
				} else if (userInput > 60) {
					System.out.println(userName + ", you genius! You entered " + userInput + ". That number is even!");
				}
			}

			System.out.print("Would you like to continue? (y/n): ");
			cycle = scnr.next().toLowerCase();
			System.out.println("\n");

		} while (cycle.equals("y"));
		
		scnr.close();
		System.out.println("Thank you! Have a nice day!");
		System.exit(0);

	}

}
