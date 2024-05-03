package Task10;

public class main5 {
	public static void main(String[] args) {
        // Create a black tea with milk and sugar
        Tea5 blackTea = new Tea5("Black", true, true);

        // Brew the black tea
        blackTea.brew();

        // Add milk to the black tea
        blackTea.addMilk();

        // Add sugar to the black tea
        blackTea.addSugar();

        // Serve the black tea
        blackTea.serve();
    }

}
