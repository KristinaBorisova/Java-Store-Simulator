/*Клас Стока, която ще се продава в магазин – съхранява идентификационен номер, име, 
 * единична цена на стоката и срок на годност;
*/
package src;

import java.time.LocalDate;
import java.util.Objects;

public class Goods {
    private int id;
    private static int numberOfGoods;
    private String goodsName;
    private double pricePerUnit;
    private LocalDate expirationDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return id == goods.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public double getPrice() {
        return this.pricePerUnit;
    }
}
