package Task11;

import java.util.Scanner;

public class four {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the first number
	        System.out.print("Enter the first number: ");
	        int a = scanner.nextInt();

	        // Prompt the user to enter the second number
	        System.out.print("Enter the second number: ");
	        int b = scanner.nextInt();
	        try {
	        	// perform division
	        	int r=divide(a,b);
	        	System.out.printf("Result of divide: " +r);
	        }catch (ArithmeticException e) {
	            // Handle division by zero exception
	            System.out.println("Error: Cannot divide by zero");
	        }

	        scanner.close();
	 }

	private static int divide(int a, int b) {
		// TODO Auto-generated method stub
		// Check if the denominator is zero
        if (b == 0) {
            // If denominator is zero, throw ArithmeticException
            throw new ArithmeticException("Division by zero");
        }
        // Perform division and return the result
        return a / b;
    }
		

}
