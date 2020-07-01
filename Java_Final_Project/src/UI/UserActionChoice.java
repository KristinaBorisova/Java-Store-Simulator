package UI;

public enum UserActionChoice {


    createShop ("1"), showGoods ("2"),
    showCashiers ("3"), showReceipt ("4"),
    addBudget ("5"), makeAPurchase ("6"),
    checkBudget ("7"), addNewCashier ("8"),
    addNewGood ("9"), yes ("y"), no ("n");

    public final String value;

    UserActionChoice() {
        this.value = "";
    }

    UserActionChoice(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

