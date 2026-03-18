package KlasowoObiektowo.KlasyZwykle.String4661Done.Obiektowe;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String przykladowyString ="to jest pewien probny string.";
        String przykladowyString2 ="ao-jest-pewien-testowy-string.";

        int dlugosc = przykladowyString.length();
        System.out.println("Metoda 1 .lenght() -> obliczanie długości stringa"+dlugosc);

        przykladowyString = przykladowyString.replace(' ','-');
        System.out.println("Metoda 2 .replace(char a, char b) -> zamian pierwszego argumentu na drugi"+przykladowyString);

        System.out.println("Metoda 2.1 .replace(char a, char b) -> zamian pierwszego argumentu na drugi"+przykladowyString.replace('t','q'));

        przykladowyString=przykladowyString.replace("probny","testowy");
        System.out.println("Metoda 3 .replace(CharSeguence a, CharSequnce b) -> zamian pierwszego argumentu na drugi"+przykladowyString);

        System.out.println("Metoda 4 .toString() -> zwraca Stringa "+przykladowyString);
        przykladowyString = przykladowyString.toString();

        System.out.println("Metoda 5 .equals(Object object) -> zwraca booleana czy takie same Stringi "+przykladowyString.equals(przykladowyString2));

        System.out.println("Metoda 6 .getBytes(Charset charset) -> zwraca zdekodowanego stringa za pomocą Charsetu "+przykladowyString.getBytes(StandardCharsets.UTF_8));

        System.out.println("Metoda 7 .getBytes() -> zwraca zdekodowanego stringa za pomocą domyślnego kodowania "+przykladowyString.getBytes());

        System.out.println("Metoda 8 .toUpperCase() -> zwraca  stringa w wielkich literach "+przykladowyString.toUpperCase());

        System.out.println(przykladowyString);

        System.out.println("Metoda 9 .toLowerCase() -> zwraca  stringa w wielkich literach "+przykladowyString.toLowerCase());
        //W tym przypadku zamieniamy na małe litery jednak w tym przypadku nic się nie zmieni
        System.out.println("Metoda 10 .toLowerCase(Locale locale) -> zwraca  stringa w małych literach na podstawie języka"+przykladowyString.toLowerCase(Locale.CHINA));

        System.out.println("Metoda 11 .toUpperCase(Locale locale) -> zwraca  stringa w wielkich literach "+przykladowyString.toUpperCase(Locale.FRANCE));

        char[] charArray = przykladowyString.toCharArray();
        String charArrayString = charArray.toString();
        System.out.println("Metoda 12 .toCharArray() -> zamienia dany string na tablice z char "+charArray);
        System.out.print("Teraz wyświetlamy zawartość tablicy za pomocą enchance for ");
        for(char a: charArray){
            System.out.print(a);
        }
        System.out.println();

        System.out.println("Metoda 13 .compareTo() -> zwraca 3 możliwe przypadki int: ujemna, 0 lub dodatnia w zależności" +
                " która litera jest pierwsza i o ile znaków w systemie dekodawania UTF-8: "+przykladowyString.compareTo(przykladowyString2));
        //jeśli porównując stringi za pomocą .equals() uzyskujemy true to hashcode są takie samy.
        System.out.println("Metoda 14 .hashCode() -> zwraca hashcode danego obiektu "+przykladowyString.hashCode());
        System.out.println("Metoda 15 .charAt(int a) -> zwraca  char na danym indeksie: "+przykladowyString.charAt(12));
        System.out.println("Metoda 16 .startsWith(String string) -> zwraca  booleana czy string zaczyna się od jakiegoś prefixu: "
                +przykladowyString.startsWith("as"));
        System.out.println("Metoda 17 .startsWith(String string, int a) -> zwraca  booleana czy string zaczyna się od jakiegoś prefixu: "
                +przykladowyString.startsWith("towy",2));
        System.out.println("Metoda 17.1 .startsWith(String string, int a) -> zwraca  booleana czy string zaczyna się od jakiegoś prefixu: "
                +przykladowyString.startsWith("jest",3));
        System.out.println("Metoda 18 .concat(String string) -> zwraca nowego stringa po dołączeniu do obiektu argumentu" +
                ": "+przykladowyString.concat("tochcemy dołączyć"));
        //Trzeba pamiętać, aby podać stringa w argumencie jako regex
        System.out.println("Metoda 19 .matches(String string) -> zwraca booleana czy stringi do siebie pasują: "+przykladowyString.matches(przykladowyString2));
        System.out.println("Metoda 19.1 .matches(String string) -> zwraca booleana czy stringi do siebie pasują: "+przykladowyString.matches("[a-z]"));
        System.out.println("Metoda 19.2 .matches(String string) -> zwraca booleana czy stringi do siebie pasują: "+przykladowyString.matches("\\*"));
        System.out.println("Metoda 20 .contains(String string) -> zwraca booleana czy string zawiera sekwencję znaków: "+przykladowyString.contains("jest"));

        //Metoda wait dla String jest możliwa ponieważ String dziedziczy po Object, jednak metoda ta nie jest używana ponieważ String jest współdzielony przej JVM.
//        System.out.println("Metoda 21 .wait() -> zwraca booleana czy string zawiera sekwencję znaków: "+przykladowyString.wait());

    }
}
