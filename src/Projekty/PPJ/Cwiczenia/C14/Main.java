package Projekty.PPJ.Cwiczenia.C14;

import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("=-=-=- Zadanie 1 -=-=-=");

        String rok1 = "2021-01-12";
        String rok2 = "2012-18-01";

        Pattern pattern = Pattern.compile("[12][0-9]{3}-((0[1-9])|(1[0-2]))-((0[1-9])|([1-2][0-9])|(3[01]))");

        System.out.println(pattern.matcher(rok1).matches());
        System.out.println(pattern.matcher(rok2).matches());

        System.out.println("=-=-=- Zadanie 2 -=-=-=");

        String hexText = "1AF";
        Pattern patternZ3 = Pattern.compile("[0-9A-Fa-f]+");
        System.out.println(patternZ3.matcher(hexText).matches());

        System.out.println("=-=-=- Zadanie 3 -=-=-=");

        String tmp = "A.B.C.D.";

        Pattern p1 = Pattern.compile("([A-Za-z]\\.){4}");
        System.out.println(p1.matcher(tmp).matches());

        System.out.println("=-=-=- Zadanie 4 -=-=-=");

        String logs = "";

        try{
            Scanner in = new Scanner(new FileReader("serverLog.txt"));
            int val = 0;
            while (in.hasNext())
                logs += in.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        pattern = Pattern.compile("(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})");

        Matcher matcher = pattern.matcher(logs);

        int id = 1;
        while (matcher.find())
            System.out.println(id++ + "\t" + decToHex(matcher.group(1))  + "." + decToHex(matcher.group(2)) + "." + decToHex(matcher.group(3)) + "." + decToHex(matcher.group(4)));
    }

    private static String decToHex(String dec){
        int val = Integer.parseInt(dec);
        String res = "";

        if (val == 0)
            return "0";
        else
            while (val > 0){
                int tmp = val%16;
                res = (char)((tmp<10)?(tmp + '0'):(tmp - 10 + 'A')) + res;
                val /= 16;
            }

        return res;
    }
}