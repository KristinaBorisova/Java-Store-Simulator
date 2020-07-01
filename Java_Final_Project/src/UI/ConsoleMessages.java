package UI;

import java.util.Scanner;

public class ConsoleMessages {


    public void showMenu() {
        System.out.println ("+-------------------------------------------+");
        System.out.println ("|              Здравейте,                   |");
        System.out.println ("|        Изберете опция от менюто           |");
        System.out.println ("+-------------------------------------------+");

        /***************************************************/

        System.out.println ("            ------Мениджър------");
        System.out.println ("(1)  Създай магазин");
        System.out.println ("(2)  Изведи наличност на стоки");
        System.out.println ("(3)  Изведи информация за Всички Касиер - предварително въведена");
        System.out.println ("(4)  Изведи общата стойност на всяка издадена касова бележка ");
        System.out.println ("            ------Клиент--------");
        System.out.println ("(5)  Въведи бюджет ");
        System.out.println ("(6)  Направи покупка");
        System.out.println ("(7)  Провери бюджет");

        System.out.println ("            ---Допълнителни действия---      ");

        System.out.println ("(8) - *Въведи данни за Нов Касиер: идентификационен номер, име, каса на която работи");
        System.out.println ("(9) - *Въведи данни за Стока: идентификационен номер, име, единична цена и срок на годност");

        System.out.println ("(0)  Изход");
        System.out.println ("-------------------------------------\n");
    }


    public void displayOption1Msg() {
        System.out.println ("Вие избрахте да създадете нов магазин!");
    }

    public void displayOption2Msg() {
        System.out.println ("Вие избрахте да изведете всички налични стоки!");
    }

    public void displayOption3Msg() {
        System.out.println ("Вие избрахте да изведете информация за всички работещи касиeри!");
    }


    public void displayOption5Msg() {
        System.out.println ("Вие избрахте да въведете бюджет");
    }

    public void inputError() {
        System.out.println ("Грешен вход. Моля опитайте отново!");
    }

    public void endOfProcess() {
        System.out.println ("You have chosen to exit the menu!");
    }
    public void displayOption6Msg() {
        System.out.println ("Вие избрахте да направите нова покупка");
    }

    public void displayOption7Msg() {
        System.out.println ("Вие избрахте да проверите своя бюджет");
    }

    public void displayOption8Msg() {
        System.out.println ("Вие избрахтe да въведете данни за нов служител");
    }

    public void displayOption9Msg() {
        System.out.println ("Вие избрахтe да въведете данни за нова стока");
    }
}
