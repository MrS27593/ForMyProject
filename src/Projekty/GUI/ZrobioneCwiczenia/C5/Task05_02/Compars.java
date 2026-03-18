package FinalneMarcinaIMoje.Task05_02;




import java.util.Arrays;

public class Compars {
    public static void main(String[] args) {
        Integer[] a = {1,5,33,12,98,15};
        printTable("Original    ", a);

        //==Original    [ 1 5 33 12 98 15 ]

        Arrays.sort(a,new MyComp(Charakterystyka.BY_VAL));
        printTable("ByVal       ", a);

        //==ByVal       [ 1 5 12 15 33 98 ]

        Arrays.sort(a,new MyComp(Charakterystyka.BY_VAL_REV));
        printTable("ByValRev    ", a);

        //==ByValRev    [ 98 33 15 12 5 1 ]

        Arrays.sort(a,new MyComp(Charakterystyka.BY_NUM_OF_DIVS));
        printTable("ByNumOfDivs ", a);

        //==ByNumOfDivs [ 1 5 15 33 12 98 ]

        Arrays.sort(a,new MyComp(Charakterystyka.BY_SUM_OF_DIGS));
        printTable("BySumOfDigs ", a);

        //==BySumOfDigs [ 1 12 5 15 33 98 ]
    }

    static void printTable(String mess, Integer[] a) {
        System.out.print(mess + "[ ");
        for (int d : a) System.out.print(d + " ");
        System.out.print("]\n");
    }
}
