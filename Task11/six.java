package Task11;

import java.util.Scanner;

public class six {
	private static final String CORRECTPASSWORD = "password123";

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the password
        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        try {
            // Check if the entered password is correct
            if (!enteredPassword.equals(CORRECTPASSWORD)) {
                // If incorrect, throw IncorrectPasswordException
                throw new IPException("Incorrect password entered");
            }

            // If the password is correct, login successful
            System.out.println("Login successful!");
        } catch (IPException e) {
            // Catch and handle IncorrectPasswordException
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

}
