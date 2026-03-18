package KlasowoObiektowo.SlowaKluczowe.AssertDone;

public class Main {
    String a;

    public static void main(String[] args) {
        int x =5;
        //sprawdzamy warunek czy jest spełniony, jeśli tak kod działa dalej.
        assert x > 0;
        System.out.println("Program działa prawidłowo");

        x = -1;
        assert x < 0 : "dobrze, x teraz jest mniejsze od 0";
        System.out.println("program działa dalej");

        x=-2;
        assert x > 0 : "x nie może być teraz większe od 0";

    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        assert amount > 0 : "Kwota wypłaty musi być dodatnia";
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Brak wystarczających środków.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);
        account.withdraw(50.0);  // Poprawne
        account.withdraw(-10.0); // Spowoduje błąd w trybie debugowania
    }
}