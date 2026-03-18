package KlasowoObiektowo.SlowaKluczowe.NullDone;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        String name = null;

        if(name == null){
            System.out.println("Brak wartości");
        }

        String text = null;
        System.out.println(text.length()); //NPE

        if (text != null){
            System.out.println(text.length());
        }else {
            System.out.println("Brak tekstu");
        }

        Integer number = null;
        if(number == null){
            number = 0;
        }

        List<String> list = new ArrayList<>();
        list.add(null);

        if(Objects.isNull(list)){
            System.out.println("Brak wartości");
        }

        Optional<String> maybeText = Optional.ofNullable(text);
        maybeText.ifPresent(System.out::println);
    }


}
