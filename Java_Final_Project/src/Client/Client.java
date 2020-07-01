package Client;

import java.util.Scanner;

public class Client implements iClient {

    private double budget;
    private String name;

    public Client() {
        this.name = name;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public double checkBudget() {
        double clientBudget = getBudget ();
        return clientBudget;
    }

    public void getDetails() {
        System.out.println ("Name:" + getName () + " " + "Budget:" + checkBudget ());
    }

    public void setDetails() {
        Scanner input = new Scanner (System.in);
        System.out.print ("Име:");
        String clientName = input.nextLine ();
        setName (clientName);
        System.out.print ("Бюджет:");
        Double clientBudget = input.nextDouble ();
        setBudget (clientBudget);
    }
}




