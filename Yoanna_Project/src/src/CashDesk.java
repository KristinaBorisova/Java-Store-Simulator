/*
 * Клас Каса в магазин – съхранява информация за това кой касиер работи в момента на тази каса.
 * На касата клиентите в магазина плащат за закупените стоки и получават касова бележка.
 */
package src;

import java.util.List;

public class CashDesk extends Cashier {

	private int numberOfCashDesks;
	private List<Cashier> cashiersList;
	private List<CashDesk> rankingList;
	private double revenue; // оборот

	public CashDesk(String name, int id_number) {

	}
}
