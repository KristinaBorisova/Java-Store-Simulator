/*Клас Стока, която ще се продава в магазин – съхранява идентификационен номер, име, 
 * единична цена на стоката и срок на годност;
*/
package src;

public class Goods {
	protected String goodName; // име на стока
	protected int idNumber;
	protected double pricePerUnit; // единична цена на стоката
	protected String goodUntill; // срок на годност

	public Goods(String goodName, int idNumber, double pricePerUnit, String goodUntill) {
		this.goodName = goodName;
		this.idNumber = idNumber;
		this.pricePerUnit = pricePerUnit;
		this.goodUntill = goodUntill;
	}

}
