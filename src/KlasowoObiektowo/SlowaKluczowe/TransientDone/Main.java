package KlasowoObiektowo.SlowaKluczowe.TransientDone;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        User user = new User("Jan","haslo1234");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.dat"));
        oos.writeObject(user);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.dat"));
        User deserialized = (User) ois.readObject();
        ois.close();

        System.out.println(deserialized.name);
        System.out.println(deserialized.password);
    }
}

class User implements Serializable {
    String name;
    transient String password;
    public User(String name, String password){
        this.name=name;
        this.password=password;
    }
}