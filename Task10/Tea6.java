package Task10;

public class Tea6 {
	 public void prepareTea() {
	        boilWater();
	        steepTeaBag();
	        pourInCup();
	        addLemon();
	    }

	    protected void boilWater() {
	        System.out.println("Boiling water");
	    }

	    protected void steepTeaBag() {
	        System.out.println("Steeping the tea bag");
	    }

	    protected void pourInCup() {
	        System.out.println("Pouring into cup");
	    }

	    protected void addLemon() {
	        System.out.println("Adding lemon");
	    }
}
