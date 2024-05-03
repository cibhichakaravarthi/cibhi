package Task10;

public class Tea5 {
	
	    private String type;
	    private boolean hasMilk;
	    private boolean hasSugar;

	    // Constructor
	    public Tea5(String type, boolean hasMilk, boolean hasSugar) {
	        this.type = type;
	        this.hasMilk = hasMilk;
	        this.hasSugar = hasSugar;
	    }

	    // Method to brew the tea
	    public void brew() {
	        System.out.println("Brewing " + type + " tea...");
	    }

	    // Method to add milk to the tea
	    public void addMilk() {
	        if (hasMilk) {
	            System.out.println("Adding milk to the tea.");
	        } else {
	            System.out.println("This tea doesn't require milk.");
	        }
	    }

	    // Method to add sugar to the tea
	    public void addSugar() {
	        if (hasSugar) {
	            System.out.println("Adding sugar to the tea.");
	        } else {
	            System.out.println("This tea doesn't require sugar.");
	        }
	    }

	    // Method to serve the tea
	    public void serve() {
	        System.out.println("Enjoy your " + type + " tea!");
	    }
	


}
