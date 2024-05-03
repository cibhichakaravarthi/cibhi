package Task10;

public class main7 {
	public static void main(String[] args) {
        Tea7[] teas = new Tea7[3];
        teas[0] = new BlackTea7();
        teas[1] = new GreanTea7();
        teas[2] = new HerbalTea7();

        for (Tea7 tea : teas) {
            System.out.println("Preparing " + tea.getClass().getSimpleName() + ":");
            tea.prepareTea();
            System.out.println();
        }
    }

}
