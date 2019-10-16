
import Manager.AccountManager;
import Manager.TheatreManager;

public class AppMain {

    public static void main(String[] args) {
        AppLauncher appLauncher = new AppLauncher();
        appLauncher.start();
    }
}

//Simple inherited classes action here YUM!

class AppLauncher{

    private AccountManager accountManager;
    private TheatreManager theatreManager;

    public void start(){

        accountManager = new AccountManager();
        accountManager.addUser("Anmol", 67577447);
        accountManager.addUser("Dharmish", 44553372);
        accountManager.displayUsers();



    }
}



