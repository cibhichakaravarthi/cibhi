package Task10;

public class GreanTea extends Tea6 {
	    public void prepareTea() {
	        boilWater();
	        steepGreenTea();
	        pourInCup();
	        addLemon();
	    }

	    private void steepGreenTea() {
	        System.out.println("Steeping green tea leaves for 2 minutes");
	    }

	    public static void main(String[] args) {
	        GreanTea greenTea = new GreanTea();
	        System.out.println("Preparing Green Tea:");
	        greenTea.prepareTea();
	    }


}
