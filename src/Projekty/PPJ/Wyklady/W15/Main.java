package Projekty.PPJ.Wyklady.W15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public
class Main {

    public static void main(String[] args) {
/*        {
            String str = "143";
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == '1'){
                    if(str.charAt(i+1) == '2' || str.charAt(i+1) == '4'){
                        if(str.charAt(i+2) == '3')
                            System.out.println("mam: "+i);
                    }
                }
            }

            System.out.println(
                str.indexOf("123")
            );
        }*/

        /*{
            String str = "a123a";

            Pattern p = Pattern.compile("123");
            Matcher m = p.matcher(str);
            System.out.println( m.find() );
        }*/

        /*{
            String str = "143";

            Pattern p = Pattern.compile("1[248]3");
            Matcher m = p.matcher(str);
            System.out.println( m.matches() );
        }*/

/*        {
            String str = "1945";

            Pattern p = Pattern.compile("1[0123456789][0-9]\\d");
            Matcher m = p.matcher(str);
            System.out.println( m.matches() );
        }*/
        /*{
            String str = "19k5";

            Pattern p = Pattern.compile("1[0123456789][0-9a-zA-Z&&[^klm]]\\d");
            Matcher m = p.matcher(str);
            System.out.println( m.matches() );
        }
        */
        /*{
            String str = "1945";

//            Pattern p = Pattern.compile("\\d\\d\\d\\d");
//            Pattern p = Pattern.compile("\\d{4}");
//            Pattern p = Pattern.compile("\\d{3,8}");
//            Pattern p = Pattern.compile("\\d{3,}");
//            Pattern p = Pattern.compile("\\d?"); // "\\d{0,1}"
//            Pattern p = Pattern.compile("\\d*"); // "\\d{0,}"
            Pattern p = Pattern.compile("\\d+"); // "\\d{1,}"
            Matcher m = p.matcher(str);
            System.out.println( m.matches() );
        }*/

        /*{
            String str = "asdfghnjmktyuikb,.";

            Pattern p = Pattern.compile(".*"); // "\\d{1,}"
            Matcher m = p.matcher(str);
            System.out.println( m.matches() );
        }*/

        /*{
            String str = "@#$.,";

//            Pattern p = Pattern.compile("\\w"); // [a-zA-Z0-9]
            Pattern p = Pattern.compile("\\W*"); // [^a-zA-Z0-9]
            Matcher m = p.matcher(str);
            System.out.println( m.matches() );
        }
        */

        /*{
            String str = "AlaMaKota";

//            Pattern p = Pattern.compile("\\s*"); //
            Pattern p = Pattern.compile("\\S*"); //
            Matcher m = p.matcher(str);
            System.out.println( m.matches() );
        }*/
        {
            String str = ">123< - opis1\n"
                    +">456< - opis2\n"
                    +">789< - opis3\n";

            Pattern p = Pattern.compile("(>(\\d{3,})<) - (\\w+)");
            System.out.println("(>(\\d{3,})<) - (\\w+)");
            Matcher m = p.matcher(str);
            while(m.find()) {
                for(int i=0; i<=m.groupCount(); i++) {
                    if(i == 2) {
                        int val = Integer.parseInt(m.group(i));
                        System.out.println(val);
                    }
                    System.out.println("group " + i + ": " + m.group(i));

                }
            }
        }

    }
}


class BitOperations {

    public static void main(String[] args) {
        /*
        15 -> 00001111
        00001111 >> 3 -> 00000001
         */

        int val = 15;
        System.out.println( val >> 3 );

        // ===================================
/*
        // 01110011_00010001
        //&11111111_11101111
        // 01110011_00000001
 */
        val = 0b01110011_00010001;
        System.out.println( val );
        System.out.println( val & 0b11111111_11101111);

        System.out.println(
                decToBin(189)
        );
    /*
        // 1000000...1001
        // 1000000...1001 >> 2
        // 1110000...0010

        // 1000000...1001 >>> 2
        // 0010000...0010
    */
    }

    public static String decToBin(int val){
        StringBuilder sb = new StringBuilder();
        for(int i=31; i>=0; i--)
            sb.append( (val >> i) & 0b0001 );
        return sb.toString();
    }
}
