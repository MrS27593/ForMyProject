package Projekty.GUI.Wyklady.W5.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

//Publiczna klasa MyCollectorTask
public
    class MyCollectorTask {

    //Stworzenie pola "aku" typu List o szablonie <MyStringItem>
    List<MyStringItem> aku;

    //Publiczny Konstruktor który przypisuje podany argument do pola obiektu
    public MyCollectorTask() {
        this.aku = new ArrayList<>();
    }

    //2 Prywatne pola "buffS1" i "buffS2" typu String, które mają działać jako bufor sprawdzający czy dane rzeczy się już nie powtórzyły
    private String buffS1, buffS2;

    //Publiczna niezwracająca metoda "accept"
    public void accept(String str){
        buffS1 = buffS2;
        buffS2 = str;
        if(buffS1 != null){
            aku.add(
                new MyStringItem( buffS1, buffS2)
            );
            //Wynulowanie buforów
            buffS1 = null;
            buffS2 = null;
        }
    }

    //Publiczna metoda "finish" zwracająca Listę szablonu <MyStringItem>
    public List<MyStringItem> finish(){
        //zwrócenie pola aku
        return aku;
    }

    //Publiczna metoda "combine" która wyrzuca Exception ponieważ metoda nie jest wspierana
    public MyCollectorTask combine(MyCollectorTask m){
        throw new UnsupportedOperationException();
    }

    //Publiczna statyczne metoda "collector", która zwraca Collector jakiegoś typu
    public static Collector<String, ?, List<MyStringItem>> collector(){
        return Collector.of(
            MyCollectorTask::new,
            MyCollectorTask::accept,
            MyCollectorTask::combine,
            MyCollectorTask::finish
        );
    }

}
