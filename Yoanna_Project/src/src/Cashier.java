//Клас Касиер – съхранява информация за идентификационен номер и име на касиера
package src;
public class Cashier {
    private static int countCashiers;
    private String name;
    private int id_number;
    private int counter;

	public Cashier() { // конструктор
		// ...
		counter++;
	}

	public static int getNumOfInstancesCashier() {
		return counter;
	}

	public String getName() {
		return this.name;
	}

	public int getID() {
		return this.id_number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setID(int id_number) {
		this.id_number = id_number;
	}

	public static void printDetails() {
		System.out.print("Данни на касиер:" + name + " " + id_number + "\n");
	}
}
