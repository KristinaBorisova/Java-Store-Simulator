package UI;

import Store.Store;
import Store.Goods;
import Store.Cashier;
import Client.Client;

import java.util.Scanner;

import static UI.UserActionChoice.checkBudget;

public class UiManagerImpl implements UiManager {

    private final ConsoleMessages messagesManager;
    private final Store storeManager;
    private final Goods goodsManager;
    private final Cashier cashierManager;
    private final Client clientManager;

    public UiManagerImpl() {
        this.cashierManager = new Cashier ();
        this.storeManager = new Store ();
        this.messagesManager = new ConsoleMessages ();
        this.goodsManager = new Goods ();
        this.clientManager = new Client ();
    }

    @Override
    public void getUserActionMenu() {
        messagesManager.showMenu ();
        chooseOptionFromMenu ();
    }

    private void chooseOptionFromMenu() { // метод за начално меню
        getUserChoice ();
    }

    private void createNewStore() {
        storeManager.openNewStore ();
        continueMenu ();
    }

    private void showAllGoods() {
        goodsManager.showAllGoods ();
        continueMenu ();
    }

    private void showAllCashiers() {
        System.out.println ("Брой касиери:");
        cashierManager.getNumOfInstancesCashier ();
        cashierManager.printDetails ();
        continueMenu ();
    }

    private void addBudget() {
        System.out.println ("Моля въведете");
        clientManager.setDetails ();
        clientManager.getDetails ();
        continueMenu ();
    }

    private void checkClientBudget() {
        clientManager.checkBudget ();
        continueMenu ();
    }


    UserActionChoice getUserChoice() {
        Scanner input = new Scanner (System.in);
        int userChoice = Integer.parseInt (input.nextLine ().trim ());
        UserActionChoice userActionChoice = null;
        switch (userChoice) {
            case 1 -> {
                messagesManager.displayOption1Msg ();
                createNewStore ();
                return userActionChoice.createShop;
            }
            case 2 -> {
                messagesManager.displayOption2Msg ();
                showAllGoods ();
                return userActionChoice.showGoods;
            }
            case 3 -> {
                messagesManager.displayOption3Msg ();
                showAllCashiers ();
                return userActionChoice.showCashiers;
            }
            case 4 -> {
//                messagesManager.displayOption3Msg ();
//                showAllCashiers ();
                return userActionChoice.showReceipt;
            }
            case 5 -> {
                messagesManager.displayOption5Msg ();
                addBudget ();
                return userActionChoice.addBudget;
            }
            case 6 -> {
                messagesManager.displayOption6Msg ();
                //makeAPurchase ();
                return userActionChoice.makeAPurchase;
            }
            case 7 -> {
                messagesManager.displayOption7Msg ();
                checkClientBudget ();
                return checkBudget;
            }
            case 8 -> {
                messagesManager.displayOption8Msg ();
                //addNewCashier();
                return userActionChoice.addNewCashier;
            }
            case 9 -> {
                messagesManager.displayOption9Msg ();
                //addNewGood();
                return userActionChoice.addNewGood;
            }
            case 0 -> {
                messagesManager.endOfProcess ();
            }
            default -> {
                messagesManager.inputError ();
                return getUserChoice ();
            }

        }
        return userActionChoice;
    }


    private String continueMenu() {
        System.out.println ("Искате ли да продължите? - y/n");
        Scanner input = new Scanner (System.in);
        String usersChoice = input.next ();
        if (usersChoice.equals ("y")) {
            System.out.println ("Моля изберете следваща опция:");
            getUserActionMenu ();

        } else if (usersChoice.equals ("n")) {
            System.out.print ("Изход от меню.");
        } else {
            System.out.println ("Моля изберете една от валидните опции!");
            getUserActionMenu ();
        }
        return usersChoice;
    }

}
