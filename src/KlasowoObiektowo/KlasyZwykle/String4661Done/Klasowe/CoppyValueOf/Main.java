package KlasowoObiektowo.KlasyZwykle.String4661Done.Klasowe.CoppyValueOf;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("====String.copyValueof()====");
        char[] charArray = new char[9];
        int i =0;
        while(i<charArray.length){
            charArray[i]='a';
            i++;
        }
        System.out.println("Metoda 1 copyValueof(char[] a): ");
        System.out.println(charArray);
        System.out.println("Oryginał "+charArray);
        System.out.println("Oryginał :"+ Arrays.toString(charArray));
        String copyofArray = String.copyValueOf(charArray);
        System.out.println("Kopia: "+copyofArray);

        System.out.println();

        System.out.println("Metoda 1 copyValueof(char[] a, int a , int b): ");
        String copyArray2 = String.copyValueOf(charArray, 0 , 3);
        System.out.println("Kopia "+copyArray2);



    }
}
