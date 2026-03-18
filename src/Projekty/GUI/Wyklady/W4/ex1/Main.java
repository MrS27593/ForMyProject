package Projekty.GUI.Wyklady.W4.ex1;

//Publiczna klasa main
public
    class Main {

    //PSVM
    public static void main(String[] args) {
        //Zmiennej "suit" typu Suit przypisujemy wartośc SPADES
        Suit suit = Suit.SPADES;

        //WYświetlamy wartość zmiennej suit
        System.out.println(suit); //OUTPUT: SPADES


        System.out.println("====");

        //Za pomocą pętli wyświtlimy wszystkie możliwe opcje Enuma
        for(Suit s : Suit.values())
            System.out.println(s);
        //OUTPUT:HEARTS
        //DIAMONDS
        //SPADES
        //CLUBS
    }
}
