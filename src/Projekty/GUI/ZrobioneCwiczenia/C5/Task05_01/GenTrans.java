package FinalneMarcinaIMoje.Task05_01;

import java.util.Arrays;

public class GenTrans {
    private static <T, R>
    void transform(T[] in, R[] out, Transform<T, R> trans) {
        for(int i = 0; i < in.length; i++)
            out[i]=trans.apply(in[i]);

    }

    public static void main (String[] args) {


        String[]  sin = {"Alice", "Sue", "Janet", "Bea"};
        System.out.println(Arrays.toString(sin) + '\n');

        //===[Alice, Sue, Janet, Bea]


        Integer[] iout = new Integer[sin.length];
        transform(sin, iout, new StrToInt());
        System.out.println(Arrays.toString(iout));

        //===[5, 3, 5, 3]

        Character[] cout = new Character[sin.length];
        transform(sin, cout, new Transform<String, Character>() {
            @Override
            public Character apply(String s) {
                return s.charAt(0);
            }
        });
        System.out.println(Arrays.toString(cout));


        //=== [A, S, J, B]

        Transform<String, String> lambda = x -> x.toUpperCase();

        String[] sout = new String[sin.length];
        transform(sin, sout, lambda);
        //lub transform(sin, sout, element->element.toUpperCase());
        System.out.println(Arrays.toString(sout));

        //== [ALICE, SUE, JANET, BEA]


    }
}
