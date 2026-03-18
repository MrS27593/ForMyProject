package KlasowoObiektowo.KlasyZwykle.Integer1879Done;

public class Main {
    public static void main(String[] args) {
//        Integer integer = new Integer(10);
        Integer i = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("20");
        Integer i3 = 30;

        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.SIZE);      // 32

        int a = Integer.parseInt("123");

        Integer i4 = 100;
        String s = i.toString(); // "100"

        int result = Integer.compare(5, 10);
        // result < 0, bo 5 < 10

        Integer a2 = 5;
        Integer b = 10;
        System.out.println(a2.compareTo(b)); // -1

        Integer i5 = 100;
        long l = i.longValue();
        double d = i.doubleValue();

        int num = 255;

        System.out.println(Integer.toBinaryString(num));   // "11111111"
        System.out.println(Integer.toHexString(num));      // "ff"
        System.out.println(Integer.toOctalString(num));    // "377"

        Integer a3 = 100;
        Integer b3 = 100;
        System.out.println(a == b); // true (bo cache od -128 do 127)

        Integer x = 200;
        Integer y = 200;
        System.out.println(x == y); // false (nie w cache)
        System.out.println(x.equals(y)); // true

    }
}
