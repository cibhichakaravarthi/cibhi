package Task10;

public class main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account4 acc=new Account4(20000);
		 acc.deposit(1000.0);
	     acc.withdraw(5000.0);
	     System.out.println("Current balance: " + acc.getBalance());

	}

}
