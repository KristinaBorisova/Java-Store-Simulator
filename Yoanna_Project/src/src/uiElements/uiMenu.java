package src.uiElements;

import java.util.Scanner;

import src.threads.CashDeskThreadsDemo;

public class uiMenu {

	public void printMenuHeader() {
		System.out.println("+-------------------------------------------+");
		System.out.println("|              Здравейте,                   |");
		System.out.println("|        Изберете опция от менюто           |");
		System.out.println("+-------------------------------------------+");
	}
	public static int menu() { // метод за начално меню
		int selection;
		Scanner input = new Scanner(System.in);

		/***************************************************/

		System.out.println("            ------Мениджър------");
		System.out.println("(1)  Създай магазин");
		System.out.println("(2)  Изведи наличност на стоки");
		System.out.println("(3)  Изведи информация за Всички Касиер - предварително въведена");
		System.out.println("(4)  Изведи общата стойност на всяка издадена касова бележка ");
		System.out.println("            ------Клиент--------");
		System.out.println("(5)  Въведи бюджет ");
		System.out.println("(6)  Направи покупка");
		System.out.println("(7)  Провери бюджет");

		System.out.println("            ---Допълнителни действия---      ");

		System.out.println("(8) - *Въведи данни за Нов Касиер: идентификационен номер, име, каса на която работи");
		System.out.println("(9) - *Въведи данни за Стока: идентификационен номер, име, единична цена и срок на годност");

		System.out.println("(0)  Изход");
		System.out.println("-------------------------------------\n");

		selection = input.nextInt();
		return selection;
	}

	public static String continueMenu() {
		System.out.println("Искате ли да продължите? - y/n");
		Scanner userAction = new Scanner(System.in);
		String usersChoice = userAction.next();
		if (usersChoice.equals("y")) {
			System.out.println("Моля изберете следваща опция:");
			int userNextAction = menu();
		} else if (usersChoice.equals("n")) {
			System.out.print("Изход от меню.");
			CashDeskThreadsDemo.currentThread();
		} else {
			System.out.println("Моля изберете една от валидните опции!");
			usersChoice = userAction.next();
		}
		return usersChoice;
	}
	
	
	
}
