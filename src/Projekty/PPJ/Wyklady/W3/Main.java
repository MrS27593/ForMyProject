package Projekty.PPJ.Wyklady.W3;

public
class Main{

    public static void main(String[] args){
        System.out.println(
                true ? "moje T" : "moje F"
        );
        int x = 0;
        int val = (6 > 2 ? x++ : 2);
        System.out.println(6 > 2 ? x++ : 2);
        System.out.println(x);

// ===============================================

        System.out.println(
                x > 10 ? "tak" : x < 5 ? "TAK < 5" : "NIE > 5 i < od 10"
        );

// =================================================

        if (false)
            System.out.println("tu1");

        System.out.println("tu2");

        if(true) {
            System.out.println("tu3");
            System.out.println("tu4");
        } else {
            System.out.println("tu6");
            System.out.println("tu7");
        }

//======================================================

        if (x > 10)
            if(x < 5)
                ;

// =====================================================
        x = 11;
        if (x > 10)
            if (x > 15)
                System.out.println("test1");
            else
                System.out.println("test2");


        if(x > 10)
            ;
        else
        if( x < 15)
            ;

// =======================================================

        x = 5;
        if ( !(x > 10))
            System.out.println("test");

//============================================

        x = 8;
        if (x > 10)
            if (x > 15)
                System.out.println("test1");
            else
                System.out.println("test2");
        else
            System.out.println("test5");

// ===============================================================

        int wrt = 5;

        switch(wrt){
            case 5:
                System.out.println("V");
                break;
            case 9:
                System.out.println("IX");
                break;
            default:
                System.out.println("def");
        }

// ======================================================

        switch(wrt){
            case 5 -> System.out.println("V");
            default -> System.out.println("def");
        }

// ======================================

        System.out.println(
                switch(wrt){
                    case 5 -> "V";
                    default -> {
                        yield "def";
                    }
                }
        );


    }

}












