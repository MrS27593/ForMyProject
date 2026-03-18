package KlasowoObiektowo.SlowaKluczowe.StrictfpDone;

public class Main {
    public static void main(String[] args) {
        PhysicCalculator physicCalculator = new PhysicCalculator();
        double a = physicCalculator.calculateEnergy(123.65);
        System.out.println(a);

        FinanceCalculator financeCalculator = new FinanceCalculator();
        System.out.println(financeCalculator.calculateInterest(123.65,2.23));

        BankSystem bankSystem = new BankSystem();
        System.out.println(bankSystem.calculateMonthlyRate(345.12,4.78));
    }
}
strictfp class PhysicCalculator{
    double calculateEnergy(double mas){
        return mas*299792458.0*299792458.0;
    }
}

class FinanceCalculator{
    strictfp double calculateInterest(double capital, double rate){
        return capital * rate / 100;
    }
}

class BankSystem{
    strictfp  double calculateMonthlyRate(double balance, double rate){
        double result = balance * rate / 12.0;
        return result;
    }
}