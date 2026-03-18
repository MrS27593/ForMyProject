package KlasowoObiektowo.SlowaKluczowe.CharDone;

public class Main {
    public static void main(String[] args) {

        char litera='b';
        char cyfra = '1';
        char polskiZnak = 'ź';
        char znakKodowany = 82;
        char unicodeChar = '\u03B3';

        System.out.println(litera);
        System.out.println(cyfra);
        System.out.println(polskiZnak);
        System.out.println(znakKodowany);
        System.out.println(unicodeChar);

        char x = 'a';
        System.out.println((int)x);

        System.out.println();

        char a = 'a';
        char aa = 'p';
        if(a<aa){
            System.out.println(a+" jest przed "+aa);
        }

        System.out.println();

        for(char q = 'a'; q <= 'z'; q++ ){
            System.out.println(q + " " );
        }

        System.out.println();

        char znak = '\u03A9';
        System.out.println(znak);

        System.out.println();

        for(char q = 'a'; q <= 'z'; q++ ){
            if(q == 'a'|| q=='e'|| q=='i'|| q=='o'|| q=='u'|| q=='y'){
                System.out.println(q+" jest samogłoską ");
            }else{
                System.out.println(q + " " );
            }
        }

        System.out.println();

        int start = 33;
        int finish = 126;
        while(start<=finish){
            char w = (char) start;
            System.out.println(w);
            start++;
        }

        char[] letters = {'j','a','v','a'};
        System.out.println(letters[0]);

    }
}
