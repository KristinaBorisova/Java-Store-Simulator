package src;

public class Main {

	public static void main(String[] args) {
		Cashier A = new Cashier();
		A.setName("Mark");
		A.setID(10001);
		A.printDetails();
		System.out.println();
		System.out.println(A.getName());
		System.out.println(A.getID());
	}

}
