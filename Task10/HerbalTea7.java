package Task10;

public class HerbalTea7 extends Tea7 {
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
 
}
