package FinalneMarcinaIMoje.Task05_02;

import java.util.Comparator;

public class MyComp implements Comparator<Integer> {
    public static final int
            BY_VAL=0, BY_VAL_REV=1,
            BY_NUM_OF_DIVS=2, BY_SUM_OF_DIGS=3;

    private Charakterystyka charakterystyka;

    public MyComp(Charakterystyka charakterystyka){
        this.charakterystyka=charakterystyka;
    }

    @Override
    public int compare(Integer number1, Integer number2) { // ( tutaj muszą być INTEGER)
        return switch (charakterystyka) {
            case BY_VAL -> compareByVal(number1, number2);
            case BY_VAL_REV -> compareByValRev(number1, number2);
            case BY_NUM_OF_DIVS -> compareByNumOfDivs(number1, number2);
            case BY_SUM_OF_DIGS -> compareBySumOfDigs(number1, number2);

        };
    }

    private  int countDiv (int number){
        int count =1;
        for(int i = 1; i < number; i++)
            if(number % i == 0){
                count++;
            }
        return count;
    }

    private  int sumOfDigs (int number){
        int sum = 0;
        while(number > 0){
           sum+=number%10;
            number/=10;
            }
        return sum;
    }

//    private  static int countDiv (int number){
//        int count =1;
//        for(int i = 1; i < number; i++)
//            if(number % i == 0){
//                count++;
//            }
//        return count;
//    }
//
//    private  static int sumOfDigs (int number){
//        int sum = 0;
//        while(number > 0){
//            sum+=number%10;
//            number/=10;
//        }
//        return sum;
//    }


    public int compareByVal(Integer number1, Integer number2) {
        if(number1.equals(number2))
            return 0;
        return number1 > number2 ? 1 : -1;
    }

    public int compareByValRev(Integer number1, Integer number2) {
        if(number1.equals(number2))
            return 0;
        return number1 < number2 ? 1 : -1;
    }

    public int compareByNumOfDivs(Integer number1, Integer number2) {
        if(this.countDiv(number1) == this.countDiv(number2))
            return compareByVal(number1, number2);
        return this.countDiv(number1) > this.countDiv(number2) ? 1 : -1;
    }

    public int compareBySumOfDigs(Integer number1, Integer number2) {
        if(this.sumOfDigs(number1) == this.sumOfDigs(number2))
            return compareByVal(number1, number2);
        return this.sumOfDigs(number1) > this.sumOfDigs(number2) ? 1 : -1;
    }


//    public int compareByNumOfDivs(Integer number1, Integer number2) {
//        if(this.countDiv(number1) == this.countDiv(number2))
//            return compareByVal(number1, number2);
//        return this.countDiv(number1) > this.countDiv(number2) ? 1 : -1;
//    }
//
//    public int compareBySumOfDigs(Integer number1, Integer number2) {
//        if(this.sumOfDigs(number1) == this.sumOfDigs(number2))
//            return compareByVal(number1, number2);
//        return this.sumOfDigs(number1) > this.sumOfDigs(number2) ? 1 : -1;
//    }

}
