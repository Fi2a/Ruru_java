package testMain2;

public class MainMethod {

	public static void main(String[] args) {
		
		CheckCard p1 = new CheckCard(10000, "2025.02.11");
		p1.processPay();
		
		CreditCard p2 = new CreditCard(45000, "2025.01.24");
		p2.processPay();
		
		Cash p3 = new Cash(5000, "2024.12.11");
		p3.processPay();
		
		Account p4 = new Account(3000, "2024.10.02");
		p4.processPay();
		

	}

}
