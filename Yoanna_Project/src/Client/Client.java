package Client;

public class Client implements iClient {
    private double budget;
    private String name;

    public Client(String name, double budget) {
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


//	@Override
//	public void setBudget(double budget) {
//		this.budget = budget;
//	}

    @Override
    public void setBudget() {
        this.budget = budget;
    }

    @Override
    public double checkBudget() {
        // TODO Auto-generated method stub
        return 0;
    }

}
