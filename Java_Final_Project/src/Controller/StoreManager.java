package Controller;

import Store.Cashier;
import UI.ConsoleMessages;
import UI.UiManager;
import UI.UiManagerImpl;

public class StoreManager {

    private final ConsoleMessages consoleMessages;
    private final UiManager uiManager;

    public StoreManager() {
        this.consoleMessages = new ConsoleMessages ();
        this.uiManager = new UiManagerImpl ();
        startProcess ();
    }


    private void startProcess() {
        Cashier A = new Cashier ();
        A.setName ("Надя");
        A.setID (1000);

        Cashier B = new Cashier ();
        B.setName ("Иво");
        B.setID (1001);

        uiManager.getUserActionMenu ();

    }

}
