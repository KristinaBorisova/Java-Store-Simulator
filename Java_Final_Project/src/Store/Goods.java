package Store;

import java.time.LocalDate;
import java.util.Objects;

public class Goods {

    private int id;
    private static int numberOfGoods;
    private String goodsName;
    private double pricePerUnit;
    private LocalDate expirationDate;

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNumberOfGoods() {
        return numberOfGoods;
    }

    public static void setNumberOfGoods(int numberOfGoods) {
        Goods.numberOfGoods = numberOfGoods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Goods goods = (Goods) o;
        return id == goods.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash (id);
    }

    public double getPrice() {
        return this.pricePerUnit;
    }


    public void showAllGoods() {
        System.out.print ("Списък с налични стоки:\n");

    }
}
