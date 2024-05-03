package Task10;

public class HerbalTea extends Tea6 {
	 public void prepareTea() {
	        boilWater();
	        steepTea();
	        pourInCup();
	    }
	    protected void steepTea() {
	        System.out.println("Steeping herbal tea leaves for 5 minutes");
	    }

	    // Herbal tea might not require lemon
	    @Override
	    protected void addLemon() {
	        // Do nothing, as herbal tea might not need lemon
	    }
	    public static void main(String[] args) {
	        HerbalTea herbalTea = new HerbalTea();
	        System.out.println("Preparing Herbal Tea:");
	        herbalTea.prepareTea();
	    }

}
