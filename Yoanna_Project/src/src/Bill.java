package src;

import java.time.LocalDate;
import java.util.List;

public class Bill {
    private Cashier cashier;
    private LocalDate date;
    private List<Goods> goodsList;

    public void addGoods(Goods goods) {
        this.goodsList.add(goods);
    }

    public int goodsQuantity(Goods goods) {
        int quantity = 0;
        for (Goods goods1 : goodsList) {
            if (goods1.equals(goods)) {
                quantity++;
            }
        }
        return quantity;
    }

    public double totalSum() {
        double sum = 0;
        for (Goods goods : goodsList) {
            sum += goods.getPrice();
        }
        return sum;
    }

    public String billText() {
        String billText = "";
        billText += this.cashier.getName() + System.lineSeparator();
        billText += this.date + System.lineSeparator();
        for (Goods goods : goodsList) {
            billText += goods + " * " + goodsQuantity(goods) + System.lineSeparator();
        }
        billText += this.totalSum() + System.lineSeparator();
        return billText;
    }


}