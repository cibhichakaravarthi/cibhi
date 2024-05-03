package Task10;

public class GreanTea7 extends Tea7 {
	public void prepareTea() {
        boilWater();
        steepGreenTea();
        pourInCup();
        addLemon();
    }

    private void steepGreenTea() {
        System.out.println("Steeping green tea leaves for 2 minutes");
    }


}
