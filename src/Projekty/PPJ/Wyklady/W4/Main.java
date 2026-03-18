package Projekty.PPJ.Wyklady.W4;

import java.util.Scanner;

public
class Main {

    public static void main(String[] args) {
/*
        System.out.println("0");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
*/
        {
            int counter = 0;
            while (counter < 5)
                System.out.println(counter++);
        }
        {
            int counter = 0;
            while (counter < 5) {
                if(!(counter%2 == 0))
                    System.out.println("ex2: "+counter);
                counter++;
            }
            System.out.println("\n");
        }
        {
            int counter = 0;
            do
                System.out.println("ex3: "+counter++);
            while(counter < 5);
        }

        {
            boolean state = false;
            while (state)
                System.out.println("ex 4: while");

            do
                System.out.println("ex 4: do-while");
            while(state);
        }

        {
/*
            Scanner scanner = new Scanner(System.in);

            int digit;

            do
                digit = scanner.nextInt();
            while(digit >= 0 && digit <= 9);
*/
        }
        {
/*
            Scanner scanner = new Scanner(System.in);

            char digit;

            do
                digit = scanner.next().charAt(0);
            while(digit >= '0' && digit <= '9');
*/
        }
        {
            Scanner scanner = new Scanner(System.in);

            char digit;
            String str = "";
            do {
                digit = scanner.next().charAt(0);
                str = str + digit;
            } while(digit >= '0' && digit <= '9');
            System.out.println(str);
        }

        {
            for(int counter = 0; counter < 5; counter++)
                System.out.println("ex 5: "+counter);
        }

        {
            int counter = 0;
            for( ; counter < 5; )
                System.out.println("ex 6: "+counter++);
        }

        {
        /*
            for( ;true; )
                System.out.println();
         */
        }

        {
            // bad example
            int counter = 0;
            while (true) {
                if(counter < 5)
                    //return;
                    break;
            }
            System.out.println("ex 7");
        }
        {

            int counter = 0;
            boolean variable = true;
            while (variable) {
                if(counter < 5)
                    variable = false;
            }
            System.out.println("ex 8");
        }


    }

}
