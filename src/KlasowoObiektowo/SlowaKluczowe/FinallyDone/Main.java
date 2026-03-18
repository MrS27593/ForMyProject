package KlasowoObiektowo.SlowaKluczowe.FinallyDone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            int x = 10 /2 ;
        }catch (ArithmeticException e){
            System.out.println("Błąd dzielenia");
        }finally {
            System.out.println("Ten kod wykona sie zawszee");
        }

        FileReader fileReader = null;

        try{
            fileReader = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(fileReader!=null){
                try{
                    fileReader.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        try{
            System.exit(0);
        }finally {
            System.out.println("to nie zadziała");
        }

        System.out.println();

        test();

        try(FileReader reader = new FileReader("data2.txt")){

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static int test(){
        try{
            return 10;
        }finally {
            System.out.println("finally");
        }
    }

    public void transferMoney(Account from, Account to, double amount){
        try{
            from.withdraw(amount);
            to.deposit(amount);
            Account.commitTransaction();
        }catch(Exception e){
            Account.rollbackTransaction();
            throw e;
        }finally {
            Account.closeTransaction();
        }
    }

    class Account{
        double balance;
        public void withdraw(double amount){
            balance -= amount;
        }

        public void deposit(double amount){
            balance += amount;
        }

        public static void commitTransaction(){
            System.out.println("Transaction commited");
        }

        public static void rollbackTransaction(){

        }

        public static void closeTransaction(){

        }
    }
}
