package Task10;

public class BlackTea extends Tea6 {
	    public void prepareTea() {
	        boilWater();
	        steepBlackTea();
	        pourInCup();
	        addLemon();
	    }

	    private void steepBlackTea() {
	        System.out.println("Steeping black tea leaves for 3 minutes");
	    }

	    public static void main(String[] args) {
	        BlackTea blackTea = new BlackTea();
	        System.out.println("Preparing Black Tea:");
	        blackTea.prepareTea();
	    }
	


}
