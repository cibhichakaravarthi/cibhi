package Task11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the file path
	        System.out.print("Enter the file path: ");
	        String filePath = scanner.nextLine();

	        try {
	            // Attempt to read data from the file
	            File file = new File(filePath);
	            Scanner fileScanner = new Scanner(file);

	            // Read and display the file contents
	            System.out.println("File contents:");
	            while (fileScanner.hasNextLine()) {
	                System.out.println(fileScanner.nextLine());
	            }

	            // Close the file scanner
	            fileScanner.close();
	        } catch (FileNotFoundException e) {
	            // Catch and handle FileNotFoundException
	            System.out.println("Error: File not found.");
	        } catch (Exception e) {
	            // Catch any other exceptions
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            // Close the scanner
	            scanner.close();
	        }

	}

}
