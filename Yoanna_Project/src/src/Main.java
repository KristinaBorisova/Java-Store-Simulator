package src;

import java.util.ArrayList;
import java.util.Scanner;

import Client.Client;
import src.threads.CashDeskThreadsDemo;
import src.uiElements.uiMenu;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Cashier> listOfCashiers = new ArrayList<Cashier>(); // Arraylist който да съдържа всички касиери
		Cashier A = new Cashier();
		A.setName("Марина");
		A.setID(10001);

		Cashier B = new Cashier();
		B.setName("Иван");
		B.setID(10002);

		Cashier C = new Cashier();
		C.setName("Калин");
		C.setID(10003);
		listOfCashiers.add(A);
		listOfCashiers.add(B);
		listOfCashiers.add(C);

		ArrayList<Goods> listOfGoods = new ArrayList<Goods>(); // Arraylist който да съдържа всички стоки

	//	Goods good1 = new Goods("Салата", 1000, 2.5, "29/05/2020");
	//	Goods good2 = new Goods("Соево Мляко", 1001, 3, "03/06/2020");
	//	Goods good3 = new Goods("Хляб", 1002, 1.50, "31/06/2020");
	//	listOfGoods.add(good1);
	//	listOfGoods.add(good2);
	//	listOfGoods.add(good3);

		ArrayList<Client> listOfClients = new ArrayList<Client>(); // Arraylist който да съдържа всички клиенти

		Client buyer1 = new Client("Ива", 20);
		Client buyer2 = new Client("Мая", 30);
		listOfClients.add(buyer1);
		listOfClients.add(buyer2);

		// Многонишков процес за работа на касите
		CashDesk desk1 = new CashDesk();
	//	desk1.setName("Каса 1");
	//	desk1.setRevenue(0);
		CashDesk desk2 = new CashDesk();
	//	desk1.setName("Каса 2");
	//	desk1.setRevenue(0);

		CashDeskThread thread1 = new CashDeskThread(desk1);
		CashDeskThread thread2 = new CashDeskThread(desk2);


		/**************** Меню *******************/
		int userChoice;
		uiMenu menuInstance = new uiMenu(); // създаваме инстанция от класа uiMenu за да достъпим методите
		menuInstance.printMenuHeader();
		userChoice = uiMenu.menu();
		while (userChoice != 0) {
			int userChoice2 = input.nextInt();
			switch (userChoice2) {
			case 0:
				System.out.println("Изход от меню!");
				break;
			case 1:
				Scanner userInput = new Scanner(System.in);
				System.out.println("2.Вие избрахте да създадете нов магазин. \n Въведете име:");
				Shop openShop = new Shop();
				String shopName = userInput.nextLine();
				openShop.setName(shopName);
				CashDeskThreadsDemo threadOption = new CashDeskThreadsDemo();
				threadOption.start();

				uiMenu.continueMenu();
				break;
			case 2:
				System.out.println("2.Вие избрахте да проверите наличните стоки:");
//				for (Goods ob : listOfGoods) {
//					System.out.println("Име на Стока:" + ob.goodName);
//					System.out.println("Номер:" + ob.idNumber);
//					System.out.println("Цена:" + ob.pricePerUnit);
//					System.out.println("Срок:" + ob.goodUntill);
//					System.out.println("----------------------");
//				}
//				uiMenu.continueMenu();
				break;

			case 3:
				System.out.println("3.Вие избрахте да получите информация за Всички касиери: \n");
				System.out.println("Брой касиери:" + Cashier.getNumOfInstancesCashier());
				for (Cashier ob : listOfCashiers) {
					System.out.println("Име на Касиер:" + ob.getName());
					System.out.println("Номер:" + ob.getID());
					System.out.println("----------------------");
				}
				uiMenu.continueMenu();
				break;
			case 4:
				System.out.println("4.Вие избрахте да получите информация за Всички издадени бележки: \n");
				uiMenu.continueMenu();
				break;
			case 5:
				System.out.println("5.Вие избрахте да въведете Вашия бюджет: \n");
				Scanner clientInput = new Scanner(System.in);
				System.out.print("Вашето име е:");
				String clientName = clientInput.next();
				System.out.print("Вашият бюджет е:");
				int clientBudget = clientInput.nextInt();
				Client client3 = new Client(clientName, clientBudget);
				listOfClients.add(client3);
				uiMenu.continueMenu();
				break;
			case 6:
				System.out.println("6.Вие избрахте да закупите стока \n");
				uiMenu.continueMenu();
			case 7:
				System.out.println("7.Вие избрахте да проверите Вашия бюджет: \n");
				for (Client ob : listOfClients) {
					System.out.println("Име:" + ob.getName());
					System.out.println("Бюджет:" + ob.getBudget());
					System.out.println("----------------------");
				}

				uiMenu.continueMenu();
			case 8:
				System.out.println("8.Вие избрахтe да въведете данни за Нов Касиер. Моля въведете:");
				Scanner input2 = new Scanner(System.in);
				System.out.print("Име на касиер:");
				String name = input2.nextLine();
				System.out.print("Идентификационен номерна на касиер:");
				int idNumber = input2.nextInt();
				Cashier D = new Cashier();
				D.setName(name);
				D.setID(idNumber);
				listOfCashiers.add(D);
				uiMenu.continueMenu();
				// Cashier newGood = Cashier.getClass().newInstance();
			case 9:
				System.out.println("9.Вие избрахте да въведете данни за нова стока.");
				Scanner inputScanner = new Scanner(System.in);
				System.out.println("-Име:");
				String nameOfGood = inputScanner.next();
				System.out.println("-Идентификационен номер:");
				int idNumb = inputScanner.nextInt();
				System.out.println("-Цена:");
				double price = inputScanner.nextDouble();

				System.out.println("-Най-добър до:");
				String goodUtill2 = inputScanner.next();

			//	Goods newGood = new Goods(nameOfGood, idNumb, price, goodUtill2);
				// addGood.setGoodName(nameOfGood);
				// addGood.setIdNumber(idNumb);
			//	listOfGoods.add(newGood);

				System.out.println("--------");
			//	newGood.getIdNumber();
			//	newGood.getGoodName();
				uiMenu.continueMenu();
				break;

			default:
				System.err.println("Моля изберете една от опциите от списъка");
			}
		}

	}
}
