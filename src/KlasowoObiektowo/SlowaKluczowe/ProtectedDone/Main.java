package KlasowoObiektowo.SlowaKluczowe.ProtectedDone;

public class Main {
    public static void main(String[] args) {

        User user = new User() {
            /**
             *
             */
            @Override
            protected void logAccess() {
                super.logAccess();
            }
        };

        user.logAccess();
    }

}

class Vehicle{
    protected void startEngine(){
        System.out.println("Silnik uruchomiony");
    }
}

class Car extends Vehicle{
    public void drive(){
        startEngine();
    }
}

class Account{
    protected double balance;

    void helper(){

    }

//    protected void helper(){
//
//    }


}

abstract class User{
    protected String username;
    protected void logAccess(){
        System.out.println("Dostęp użytkownika "+ username);
    }
}

class Admin extends User{
    public Admin (String username){
        this.username = username;
    }

    public void manage(){
        logAccess();
        System.out.println("Zarządzanie system");
    }
}