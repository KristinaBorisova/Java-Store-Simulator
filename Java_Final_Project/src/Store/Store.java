package Store;

import java.util.List;
import java.util.Scanner;

public class Store implements iStore {
    private String name;
    private List<Goods> goodsList;
    private List<CashDesk> cashDesks;
    private List<Cashier> cashiers;


    public Store() {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void getDetails() {
        System.out.println ("Вие създадохте магазин:" + getName ());
    }

    @Override
    public void openNewStore() {
        Scanner input = new Scanner (System.in);
        System.out.print ("Име на магазин:");
        String storeName = input.nextLine ();
        setName (storeName);
        getDetails ();
    }
}
