package Projekty.GUI.Wyklady.W4.ex2;

public
    class Main {

    public static void main(String[] args) {
        //Przypisanie zmiennej typu Card wartości KING
        Card card = Card.KING;

        //Wywołanie dla zmiennej card metody getValue która zwraca wartość a następnie wyświetlenie jej OUTPUT:14
        System.out.println(card.getValue());

// ==============================

        //Przypisanie do zmiennej card1 wartości Jack
        Card card1 = Card.JACK;
        //Przypisanie do zmiennej card2 typu Card wartości KING
        Card card2 = Card.KING;

        //Wyświetlenie booleanow porownan zmiennych enumow Card
        System.out.println(card == card1);
        System.out.println(card == card2);

        //========================

        //Za pomocą switch w zależności jaką wartość będzie miała karta to taka wiadomośc zostanie wyświetlona w tym przypadku card=KING
        System.out.println(
            switch (card){
                case TWO -> "dwa";
                case JACK -> "walet";
                case KING -> "krol";
            }
        );

        //Ustawienie wartości dla zmiennej "card2" wartości 5 za pomocą metody "setValue"
        card2.setValue(5);

        //Za pomocą pętli for przechodzimy przez całą listę Enumów i wyświetlamy enuma i jego wartość
        for(Card c : Card.values())
            System.out.println(c+" "+c.getValue());

        // Wyświetlenie enuma i wartości dla zmiennej "card" i "card2"
        System.out.println(card+" "+card.getValue());
        System.out.println(card2+" "+card2.getValue());

    }
}
