package KlasowoObiektowo.SlowaKluczowe.DefaultDone;

public class Main {
    public static void main(String[] args) {
        int dzien = 6;
        switch (dzien){
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            default:
                System.out.println("To jest jakiś inny dzień");
        }

        int x = 2;
        switch (x){
            default :
                System.out.println("Nic nie pasuej");
                break;
            case 1:
                System.out.println("jeden");
        }
    }
}

interface Logger{
    default void log(String message){
        System.out.println("LOG "+message);
    }
}

class FileLoger implements Logger{
    // nie trzeba implementować defoultowej metody.
}

class MyClass{
    void myMethod(){

    }
}