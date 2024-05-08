package Task11;

import java.util.Scanner;

public class seven {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter their age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Validate age
            if (age < 18) {
                // If age is less than 18, throw InvalidAgeException
                throw new IPException("You must be at least 18 years old to register.");
            }

            // Registration successful
            System.out.println("Registration successful!");
        } catch (IPException e) {
            // Catch and handle InvalidAgeException
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Catch any other exceptions
            System.out.println("Error: Invalid input.");
        } finally {
            scanner.close();
        }

	}
}
