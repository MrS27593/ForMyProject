package KlasowoObiektowo.SlowaKluczowe.CatchDone;

public class Main {
    public static void main(String[] args) {
        try{
            int a = 10/0;
        }catch(ArithmeticException e){
            System.out.println("Nie można dzielić przez 0");
        }

        int a = 10;
        int b = 0;
        int c;
        try{

             c = a/b;
        }catch(ArithmeticException e){
            System.out.println("Nie można dzielić przez 0, podniosę mianownik o 1");
            b+=1;
            c=a/b;
            System.out.println(c);
        }

        try{
            int p = 5/0;
        }catch(NullPointerException nullPointerException){
            System.out.println("null error");
        }

        try{
            String s = null;
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("Obiekt jest null");
        }catch (Exception  e){
            System.out.println("Inny wyjątek");
        }

        try{
            int[] arr = new int[2];
            arr[5] = 10;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Błąd tablicy lub null");
        }finally {
            System.out.println("To zawsze się wykona");
        }

        try{
            int[] numbers = {1,2,3};
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Niepoprawny indeks tablicy");
            }
        }
}
