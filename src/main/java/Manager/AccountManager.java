package Manager;

import Entity.User;
import Repository.UserRepo;
import Repository.UserRepoInterface;

public class AccountManager implements AccountManagerInterface {
    private UserRepoInterface userRepoInterface;

    public AccountManager(UserRepoInterface userRepoInterface){
        this.userRepoInterface = userRepoInterface;
    }

    public void addUser(String name, long phone){
        User user = new User(name, phone);
        this.userRepoInterface.addToList(user);
    }

    public void displayUsers(){
        this.userRepoInterface.displayUsers();
    }
}

