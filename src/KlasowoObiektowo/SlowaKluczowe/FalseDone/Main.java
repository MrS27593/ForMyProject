package KlasowoObiektowo.SlowaKluczowe.FalseDone;

public class Main {
    public static void main(String[] args) {
        boolean isLoggedIn = false;
        boolean active = false;
//        boolean x =0;
//        boolean y = "false";
        boolean hasAccess = false;
        if (hasAccess){
            System.out.println("Dostęp przyznany");
        }else {
            System.out.println("brak dostępu");
        }
        boolean falseexample = false;

        while (falseexample){
            System.out.println("to sie nigdy nie wypisze");
        }
        int a = 5;
        int b = 10;
        boolean result =  a > b;

        System.out.println(false&&false);
        System.out.println(false&&true);
        System.out.println(false||false);
        System.out.println(false||true);

    }

    class User{
        boolean active;
    }

    void test(){
        boolean x;
//        System.out.println(x); Error , brak inicjalizacji
    }
}
