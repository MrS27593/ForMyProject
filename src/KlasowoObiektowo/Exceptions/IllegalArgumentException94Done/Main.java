package KlasowoObiektowo.Exceptions.IllegalArgumentException94Done;

public class Main {
    public static void main(String[] args) {

    }
    public void setAge(int age){
        if(age<0){
            throw new IllegalArgumentException("wiek nie może byc ujemny");
        }
    }

    public void setPercentage(int p){
        if(p<0 || p>100){
            throw new IllegalArgumentException("Zakres to 0-100");
        }
    }
//    UUID.fromString("abc");

}

class User{
    public User(String name){
        if(name==null){
            throw new IllegalArgumentException("name == null");
        }
    }
}
