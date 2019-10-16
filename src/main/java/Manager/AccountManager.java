package Manager;

import Entity.User;
import Repository.UserRepo;

public class AccountManager {

    private UserRepo userRepo;

    public AccountManager(){
        userRepo = new UserRepo();
    }

    public void addUser(String name, long phone){
        User user = new User(name, phone);
        userRepo.addToList(user);
    }

    public void displayUsers(){
        userRepo.displayUsers();
    }
}

