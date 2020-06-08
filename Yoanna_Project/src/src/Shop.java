/*Клас Магазин – съхранява информация за списък със стоки, които се продават в магазина,
 * списък с касиери, които работят в магазина и брой на издадените касови бележки.
 * В магазина трябва да се доставят стоки, които след това ще се продават. 
 * Трябва да може да се осъществи продажбата на стока, ако има достатъчно налично количество от нея в магазина.
 * Във всеки един момент трябва да може да се провери колко е общия оборот на магазина към момента.
 */


package src;

import java.util.List;

public class Shop extends Goods implements iShop {
	public Shop(String goodName, int idNumber, int pricePerUnit, String goodUntill) {
		super(goodName, idNumber, pricePerUnit, goodUntill);
	}
	private double moneyBudget =0; 
	private String shopName;
	

}
