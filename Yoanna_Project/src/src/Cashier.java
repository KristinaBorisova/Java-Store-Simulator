//Клас Касиер – съхранява информация за идентификационен номер и име на касиера
package src;

public class Cashier {
	protected static int counter; // брояч на инстанции
	protected String name; // име на касиер
	protected int id_number; // идентификационен номер

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

	public void printDetails() {
		System.out.print("Данни на касиер:" + name + " " + id_number + "\n");
	}
}
