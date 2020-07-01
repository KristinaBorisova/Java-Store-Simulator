/*Клас Магазин – съхранява информация за списък със стоки, които се продават в магазина,
 * списък с касиери, които работят в магазина и брой на издадените касови бележки.
 * В магазина трябва да се доставят стоки, които след това ще се продават.
 * Трябва да може да се осъществи продажбата на стока, ако има достатъчно налично количество от нея в магазина.
 * Във всеки един момент трябва да може да се провери колко е общия оборот на магазина към момента.
 */


package src;

import java.util.List;

public class Shop {
    private String name;
    private List<Goods> goodsList;
    private List<CashDesk> cashDesks;
    private List<Cashier> cashiers;


    public Shop() {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void getDetails() {
        System.out.println ("Shop name:" + getName ());
    }
}
