package KlasowoObiektowo.Exceptions.IndexOutOfBoundsException86Done;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int i = arr[3];// ❌ indeksy: 0–2

        List<String> list = List.of("A", "B");
        list.get(2); // ❌

        String s = "abc";
        s.charAt(3); // ❌

        for (int a = 0; i <= arr.length; i++) { // ❌ <=
            System.out.println(arr[i]);
        }

        int index = 0;
        if ( index >= 0 && index < list.size()) {
            list.get(index);
        }

        list.forEach(System.out::println);
    }
}
