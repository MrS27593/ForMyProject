package KlasowoObiektowo.KlasyZwykle.System2478Done;

import java.io.Console;

public class MySystemClass {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.err.println("To jest błąd!");

        System.out.println();

        long start = System.currentTimeMillis();
        // jakiś kod
        long end = System.currentTimeMillis();
        System.out.println("Czas wykonania: " + (end - start) + " ms");

        System.out.println();

//        public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

        int[] a = {1,2,3,4};
        int[] b = new int[4];
        System.arraycopy(a, 0, b, 0, a.length);

        boolean błąd=true;
        if (!błąd) System.exit(1);

        System.gc();

        System.out.println();

        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.home"));

        System.out.println();

        System.out.println(System.getenv("PATH"));

        System.out.println();



        Console console2 = System.console();
        if (console2 == null) {
            System.out.println("Nie można użyć System.console() – użyj Scanner jako alternatywy.");
            return;
        }
        String input2 = console2.readLine("Podaj swoje imię: ");
        System.out.println("Cześć " + input2);

        Console console = System.console();
        String input = console.readLine("Podaj swoje imię: ");
    }
}
