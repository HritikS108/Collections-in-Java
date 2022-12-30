package arraylist;

import java.util.ArrayList;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ArrayList_userDefinedObject {
           
	public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("hritik", 22));
        users.add(new User("Sanidhya", 25));
        users.add(new User("Swaraj", 21));
        users.add(new User("Abhishek", 27));
        
        users.forEach(user -> {
            System.out.println("Name : " + user.getName() + "  Age : " + user.getAge());
        });
    }

}
