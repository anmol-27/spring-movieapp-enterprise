package Repository;

import Entity.User;
import java.util.ArrayList;


public class betterUserRepo implements UserRepoInterface {

    private ArrayList<User> userArrayList;

    public betterUserRepo() {
        userArrayList = new ArrayList<User>();
    }

    @Override
    public void addToList(User user){
        userArrayList.add(user);
    }

    @Override
    public void displayUsers() {
        for (int i = 0; i < userArrayList.size(); i++) {
            System.out.println(userArrayList.get(i).getName()+ "    " + userArrayList.get(i).getPhone() + " ");
        }
    }
}
