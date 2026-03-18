package KlasowoObiektowo.Interfejsy.Enumeration128;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

public class MyEnumarationInterface {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.add("jeden");
        stack.add("dwa");

        Enumeration<String> enumeration = stack.elements();
        while (enumeration.hasMoreElements()){
            String a = enumeration.nextElement();
            System.out.println("-"+a);
        }

        Vector<Integer> vector= new Vector<Integer>();
        vector.add(10);
        vector.add(9);
        vector.add(8);

        Enumeration<Integer> enumeration1 = vector.elements();
        while (enumeration1.hasMoreElements()){
            int a = enumeration1.nextElement();
            System.out.println("V: "+a);
        }

        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("rok","1997");
        hashtable.put("kolor","czarny");


        Enumeration<String> hashtableEnumeration = hashtable.elements();
        while (hashtableEnumeration.hasMoreElements()){
            String valuee = hashtableEnumeration.nextElement();
            System.out.println("Wartość: "+valuee);
        }


    }
}
