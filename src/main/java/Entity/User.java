package Entity;

public class User {

    private String name;
    private long phone;
    User(){

    }
    //To avoid it being package-private
    public User(String name, long phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName(){
        return this.name;
    }

    public long getPhone() {
        return this.phone;
    }
}
