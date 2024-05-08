package Task11;

public class fiveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // Creating a string
            String str = "Hello";
            
            // Accessing character at index 5 (out of bounds)
            char ch = str.charAt(5);
            
            System.out.println("Character: " + ch); // This line will not be executed
        } catch (StringIndexOutOfBoundsException e) {
            // Catching and handling StringIndexOutOfBoundsException
            System.out.println("Error: String index out of bounds.");
        }

	}

}
