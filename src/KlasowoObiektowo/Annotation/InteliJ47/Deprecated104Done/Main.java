package KlasowoObiektowo.Annotation.InteliJ47.Deprecated104Done;

public class Main {
    public static void main(String[] args) {
    Calculator.met();
        System.out.println(Calculator.calculator2.add(34,67));
    }
}
class Calculator{
    public static void met(){
        Calculator calculator = new Calculator();
        int q = calculator.add(2,6);
        System.out.println(q);
    }
    static Calculator calculator2 = new Calculator();

    @Deprecated
    public int add(int a , int b){
        return a+b;
    }
}
class Logger{
    /*
    @Deprecated
    Use logInfo(String mag) insted
    */
     @Deprecated(since = "1.5",forRemoval=true)
    public void log(String msg){
         System.out.println(msg);
     }
     public void logInfo(String info){
         System.out.println("[INFO] "+info);
     }
}