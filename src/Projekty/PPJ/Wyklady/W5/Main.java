package Projekty.PPJ.Wyklady.W5;

public
class Main {

    public static void main(String[] args) {
/*
        for(int i=0; i<10; i++){
            System.out.println("tu>" + i);
            if( i > 5 )
                break;
            System.out.println("tu<" + i);
        }
*/
        int wrt1 = 5;
        int wrt2 = 5;
        System.out.println( wrt1 == wrt2 );

        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println( str1 == str2 );

        String str3 = new String("Hello");
        System.out.println( str1 == str3);
        System.out.println( str1.equals(str3) );

// ===============================

        int[] arrEx1;
        //System.out.println(arrEx1); //Err
        arrEx1 = null;
        System.out.println(arrEx1);

        arrEx1 = new int[5];
        System.out.println(arrEx1);

        // Ile elementów jest w tablicy
        System.out.println(arrEx1.length);

        int[] arrEx2 = null;
        //System.out.println(arrEx2.length);//Err

        int[] arrEx3 = { 10, 20, 30};
        System.out.println(arrEx3.length);


        // =======================================

        System.out.println("arrEx1[0]: "+arrEx1[0]);
        System.out.println("arrEx3[1]: "+arrEx3[1]);

        // =======================================

        arrEx1[0] = 90;
        System.out.println("arrEx1[0]: "+arrEx1[0]);

        // =======================================

        System.out.print("[");
        for(int i=0; i < arrEx1.length; i++)
            System.out.print(arrEx1[i]+", ");
        System.out.println("]");

        // =======================================

        for(int i = 0; i < arrEx1.length; i++)
            arrEx1[i] = (int)(Math.random()*10);

        System.out.print("[");
        for(int i=0; i < arrEx1.length; i++)
            System.out.print(arrEx1[i]+", ");
        System.out.println("]");

        // ===========================================

        int val = 5;
        for(int i=0; i < arrEx1.length; i++)
            if(arrEx1[i] == val)
                System.out.println(val+" is in array");

        // =====================================
        int tmp = arrEx1[0];
        arrEx1[0] = arrEx1[1];
        arrEx1[1] = tmp;

        System.out.print("[");
        for(int i=0; i < arrEx1.length; i++)
            System.out.print(arrEx1[i]+", ");
        System.out.println("]");
        //=======================

        int[] tmpArr = new int[4];
        for(int i=0; i<2; i++)
            tmpArr[i] = arrEx1[i];
        for(int i=3, j = 2; i<arrEx1.length; i++, j++)
            tmpArr[j] = arrEx1[i];

        arrEx1 = tmpArr;

        System.out.print("[");
        for(int i=0; i < arrEx1.length; i++)
            System.out.print(arrEx1[i]+", ");
        System.out.println("]");

        // ==========================================

        System.out.println(arrEx1[4]);

        // ================================


    }
}

