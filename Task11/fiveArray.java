package Task11;

public class fiveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // Creating an array of size 3
            int[] array = new int[3];
            
            // Accessing element at index 3 (out of bounds)
            int value = array[3];
            
            System.out.println("Value: " + value); // This line will not be executed
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching and handling ArrayIndexOutOfBoundsException
            System.out.println("Error: Array index out of bounds.");
        }

	}

}
