package KlasowoObiektowo.SlowaKluczowe.ByteDone;

public class Main {

    public static void main(String[] args) {
        byte byte1 = 100;
        System.out.println(byte1);

//        byte1= 923;
        System.out.println(byte1);
        byte a = 10;
        byte b = 19;
        //Istnieje potrzeba jawnego rzutowania, bo domyślnie wykonuje na int
        byte c = (byte) (a + b);
        System.out.println(c);

        byte[] byteArray = new byte[1024];
        Byte myByteObject = 127;
        byte myPrimiteve = myByteObject;

        //Zadania wypisać liczbę -50
        byte q = (byte) 206;
        System.out.println(q);
        //Zadanie co się wyświetli, jeśli do byte przypiszesz 200
        byte w = (byte) 200;
        System.out.println("Wyświetli się (200-256=-56)"+w);

        byte[] data = new byte[5];
        data[0] = 10;
        data[1] = -50;

        Main.met();

        System.out.println();

        met();

    }
    public static void met(){
        byte[] buffer = {10,20,30,40,50};

        for(byte b : buffer){
            System.out.print(b+" ");
        }
    }
}
