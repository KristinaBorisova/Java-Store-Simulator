package src;

public class CashDeskThread implements Runnable {
	CashDesk cashDesk;
	
	CashDeskThread(CashDesk c) {
		cashDesk = c;
	}

	@Override
	public void run() {
		System.out.print("Процес в действие");
	//	cdesk.printDetails();

	}
	
	public void printDetails() {
		cashDesk.getName();
		cashDesk.getRevenue();

	}

}
