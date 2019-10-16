package Repository;

import Entity.User;

import java.util.ArrayList;

public class UserRepo {

    private ArrayList<User> userArrayList;

    public UserRepo() {
        userArrayList = new ArrayList<User>();
    }

    public void addToList(User user){
        userArrayList.add(user);
    }

    public void displayUsers() {
        for (int i = 0; i < userArrayList.size(); i++) {
            System.out.println(userArrayList.get(i).getName()+ "    " + userArrayList.get(i).getPhone() + " ");
        }
    }
}
