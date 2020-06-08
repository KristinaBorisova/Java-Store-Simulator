package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

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

		System.out.println("8 - *Въведи данни за Нов Касиер: идентификационен номер, име, каса на която работи");
		System.out.println("9 - *Въведи данни за Стока: идентификационен номер, име, единична цена и срок на годност");

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
			System.out.print("Изход");
		} else {
			System.out.println("Моля изберете една от валидните опции!");
			usersChoice = userAction.next();
		}
		return usersChoice;
	}

	private static void printMenuHeader() {
		System.out.println("+-------------------------------------------+");
		System.out.println("|              Здравейте,                   |");
		System.out.println("|        Изберете опция от менюто           |");
		System.out.println("+-------------------------------------------+");
	}

	public static void main(String[] args) {
		ArrayList<Goods> listOfGoods = new ArrayList<Goods>(); // Arraylist който да съдържа всички стоки
		Goods good1 = new Goods("Салата", 1000, 2.5, "29/05/2020");
		Goods good2 = new Goods("Соево Мляко", 1001, 3, "03/06/2020");
		Goods good3 = new Goods("Хляб", 1002, 1.50, "31/06/2020");
		listOfGoods.add(good1);
		listOfGoods.add(good2);
		listOfGoods.add(good3);

		Scanner input = new Scanner(System.in);
		Cashier A = new Cashier();
		A.setName("Мария");
		A.setID(10001);

		Cashier B = new Cashier();
		B.setName("Иван");
		B.setID(10002);

		/**************** Меню *******************/
		int userChoice;
		printMenuHeader();
		userChoice = menu();
		while (userChoice != 0) {
			int userChoice2 = input.nextInt();

			switch (userChoice2) {
			case 0:
				System.out.println("Изход от меню!");
				break;
			case 1:

				break;
			case 2:
				System.out.println("2.Вие избрахте да проверите наличните стоки:");
				for (Goods ob : listOfGoods) {
					System.out.println("Име на Стока:" + ob.goodName);
					System.out.println("Номер:" + ob.idNumber);
					System.out.println("Цена:" + ob.pricePerUnit);
					System.out.println("Срок:" + ob.goodUntill);
					System.out.println("----------------------");
				}
				// showGoods();

				continueMenu();

			case 3:
				System.out.println("3.Вие избрахте да получите информация за Всички касиери: \n");
				System.out.println("Брой касиери:" + Cashier.getNumOfInstancesCashier());
				A.printDetails();
				B.printDetails();
				continueMenu();

				break;
			case 4:
				System.out.println("4.Вие избрахте да получите информация за Всички издадени бележки: \n");
				continueMenu();
				break;
			case 5:
				System.out.println("5.Вие избрахте да въведете Вашия бюджет: \n");
				continueMenu();
				break;
			case 6:
				System.out.println("5.Вие избрахте да закупите стока \n");
				continueMenu();
			case 7:
				System.out.println("5.Вие избрахте да проверите Вашия бюджет: \n");
				continueMenu();
			case 8:
				System.out.println("5.Вие избрахтe да въведете данни за Нов Касиер. Моля въведете:");
				Scanner input2 = new Scanner(System.in);
				System.out.print("Име на касиер:");
				String name = input2.nextLine();
				System.out.print("Идентификационен номерна на касиер:");
				int idNumber = input2.nextInt();
				Cashier C = new Cashier();
				C.setName(name);
				C.setID(idNumber);
				C.printDetails();
				continueMenu();
				// Cashier newGood = Cashier.getClass().newInstance();
			case 9:
				// try {
				// date object
				// Goods d = new Goods();
				// Class cls = d.getClass();
				// System.out.println("Good object = " + d.toString());

				/*
				 * creates a new instance of the class represented by this Class object cls
				 */
				// Object obj = cls.newInstance();
				// System.out.println("Good = " + obj);
				// } catch (InstantiationException e) {
				// System.out.println(e.toString());
				// } catch (IllegalAccessException e) {
				// System.out.println(e.toString());
				// }

			default:
				System.err.println("Моля изберете една от опциите от списъка");
			}
		}
	}

}
