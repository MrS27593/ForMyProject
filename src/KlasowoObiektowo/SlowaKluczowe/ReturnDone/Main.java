package KlasowoObiektowo.SlowaKluczowe.ReturnDone;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.multiply(2,6);
        System.out.println(calculator.multiply(2,6));

        calculator.printMultiply(5,9);
        calculator.printMultiply(2,0);// nie wykona się ponieważ jeden ze składników jest = 0
        calculator.printMultiply(2,89);
    }
    int add(int a, int b){
        return a+b;
    }

    void greet(String name){
        System.out.println("Powitanie");
        return; //Opcjonalne zakończenie poniżej w tej metodzie jest już unreachable
    }
}

class Calculator{
    int multiply(int a, int b){
        return a*b;
    }

    void printMultiply(int a, int b){
        if(a==0||b==0){
            return; // jeśli warunek powyższy spełniony to przerywamy metodę.
        }
        System.out.println(a*b);
    }
}
class Auth{
    boolean login(String user, String password){
        if(user == null || password == null) return false;
        if(user.equals("admin")&&password.equals("1234")) return true;
        return false;
    }
}