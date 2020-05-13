//Клас Касиер – съхранява информация за идентификационен номер и име на касиера
package src;

public class Cashier {
	String name; // име на касиер
	long id_number; // идентификационен номер

	public String getName() {
		return this.name;
	}

	public long getID() {
		return this.id_number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setID(long id_number) {
		this.id_number = id_number;
	}

	public void printDetails() {
		System.out.print(name + " " + id_number);
	}
}
