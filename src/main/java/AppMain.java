
import Manager.AccountManager;
import Manager.AccountManagerInterface;
import Manager.TheatreManager;
import Repository.UserRepo;
import Repository.UserRepoInterface;
import Repository.betterUserRepo;

public class AppMain {

    public static void main(String[] args) {
        AppLauncher appLauncher = new AppLauncher();
        appLauncher.start();
    }
}

//Simple inherited classes action here YUM!

class AppLauncher{

    private UserRepoInterface userRepoInterface;
    private AccountManager accountManager;
    private TheatreManager theatreManager;

    public void start(){

        userRepoInterface = new UserRepo();
        accountManager = new AccountManager(userRepoInterface);
        accountManager.addUser("Anmol", 67577447);
        accountManager.addUser("Dharmish", 44553372);
        accountManager.displayUsers();



    }
}



