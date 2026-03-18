package Projekty.PPJ.Wyklady.W8;

public
class Main {

    public static void main(String[] args) {
        met1();

        System.out.println(met2());
        System.out.println(
                getRandomChar()
        );

        //3.14 -> int -> 3 -> double -> 3.14  // rzutowania
        //3.14 -> int -> 3 -> double -> 3.0 // konwersji

        int[] tab = {10, 20, 30};
        double[] arr = {1.56, 2., 3.14};
        showArray(tab);
        showArray(arr);

        //met4( 2, 2);

        rec1(0);

        System.out.println("SumaI: " + countSumI(9) );
        System.out.println("SumaR: " + countSumR(9));

        // 5!
        // 0! = 1
        // n! = n * (n-1)!

        System.out.println( factorial(25) );

        // F_n = F_(n-1) + F_(n-2)
        // n == 0 -> 0 || n == 1 -> 1
        System.out.println( fibonacci(17));
    }

    public static int fibonacci(int num){
        if(num == 0)
            return 0;
        if(num == 1)
            return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static long factorial(long n){
        return n <= 1 ? 1 : n * factorial(n-1);
/*
        if( n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
 */
    }

    public static int countSumR(int num){
        if(num > 0)
            return num + countSumR(num - 1);
        else
            return num;
    }

    public static int countSumI(int num){
        int sum = 0;
        while(num > 0){
            sum += num;
            num--;
        }
        return sum;
    }

    public static void rec1(long i){
        System.out.println("tu"+i);
        if ( i < 10)
            rec1( i+1 );
    }


    public static void met4(int a, double b){
    }
    public static void met4(double b, int a){
    }

/* //err
    public static void metA(){
    }

    public static int metA(){
        return 1;
    }
*/

    public static void showArray(int[] a){
        System.out.print("[");
        for(int val : a)
            System.out.print(val+" ");
        System.out.println("]");
    }

    public static void showArray(double[] b){
        System.out.print("[");
        for(double val : b)
            System.out.print(val+" ");
        System.out.println("]");
    }


    public static char getRandomChar(){
        return (char)('A'+(Math.random() * ('Z'-'A')));
    }

    public static int met2(){
        return 1;
    }

    public static void met1(){
        System.out.println("tu");
        if(Math.random() > 0.5)
            return;
        System.out.println("tu2");
        return;
    }

}

