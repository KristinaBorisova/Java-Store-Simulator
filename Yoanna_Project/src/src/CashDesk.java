/*
 * Клас Каса в магазин – съхранява информация за това кой касиер работи в момента на тази каса.
 * На касата клиентите в магазина плащат за закупените стоки и получават касова бележка.
 */
package src;

import java.util.List;

public class CashDesk {
    private String name;
    private double revenue;
    private Cashier cashier;
    private List<Bill> bills;

}
