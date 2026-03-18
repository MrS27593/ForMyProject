package Projekty.GUI.Wyklady.W5.ex3;

//Publiczna klasa MyStringItem
public
    class MyStringItem {

    //Dwa prywatne pola "s1" i "s2" typu String
    private String s1, s2;

    //Publiczny konstruktor, który przypisuje podane argumenty do pól obiektowych
    public MyStringItem(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    //Przysłonięcie metody "toString", która jako String zwraca "MyStringItem([wartość s1 wartość s2])"
    @Override
    public String toString() {
        return "MyStringItem("+s1+" "+s2+")";
    }
}
