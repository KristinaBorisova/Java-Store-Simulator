package Store;

public class Cashier {
    private static int countCashiers;
    private String name;
    private int id_number;
    private int numberOfCashiers;

    public Cashier() { // конструктор
        this.numberOfCashiers++;
    }

    public int getNumOfInstancesCashier() {
        return numberOfCashiers;
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
        System.out.print ("Данни на касиер:" + getName () + " " + getID () + "\n");
    }
}


