package Projekty.PPJ.Wyklady.W7;

public
class Main {

    public static int val = 50;

    public static void met1(){
        System.out.println("met1()");
        val = 60;
    }
    public static void met2(int a, int b){

    }
    public static void main(String[] args) {
        met1();
        met2(5, 3 + 7);

        int val = 10;
        System.out.println("val"+val);
        met3(val);
        System.out.println("val"+val);

        int[] arr = {10, 20, 30, 40};
        showIntArray(arr, "arr:");
        met4(arr);
        showIntArray(arr, "arr:");

        fun('c');

    }

    public static void fun(int val){
        System.out.println("int: "+val);
    }
    public static void fun(double val){
        System.out.println("double: "+val);
    }




    public static void met4(int[] fArr){
        showIntArray(fArr, "\tfArr:");
        fArr[1] = 99;
        showIntArray(fArr, "\tfArr:");
    }

    public static void showIntArray(int[] arr, String str){
        System.out.print(str+"[");
        for(int val : arr)
            System.out.print(val+" ");
        System.out.println("]");
    }

    public static void met3(int fVal){
        System.out.println("\tfVal"+fVal);
        fVal = 20;
        System.out.println("\tfVal"+fVal);
    }



}

