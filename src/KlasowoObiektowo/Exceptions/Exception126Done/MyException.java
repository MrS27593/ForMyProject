package KlasowoObiektowo.Exceptions.Exception126Done;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MyException extends Exception{
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try{
            int x = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Nie można dzielić przez 0");;
        }

        finally {
            System.out.println("to jest finally");
        }

        try{
            String s = null;
            s.length();
        }catch (NullPointerException e){
            System.out.println("String jest nullem");
        }catch (Exception e){
            System.out.println("Inny wyjatek");
        }

        int age =5;
        if(age<18){
            throw new IllegalArgumentException("Za mało lat");
        }


    }
    public MyException(String msg){
        super(msg);
    }
}
class MyRuntimeException extends RuntimeException{
    public MyRuntimeException(String msg){
        super(msg);
    }
}


