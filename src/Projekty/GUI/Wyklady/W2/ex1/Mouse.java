package Projekty.GUI.Wyklady.W2.ex1;

//Klasa Mouse implementuje Interface USB
public
    class Mouse
    implements USB {

    //Przysłonięcie metody send - w tym przypadku wyświetlna komunikat "mouse -> connected"
    @Override
    public void send(byte[] data) {
        System.out.println(
            "mouse -> connected"
        );
    }

    //Przysłonięcie metody "receive" w tym przypadku zwraca tablice typu byte o wartościach 120 87
    @Override
    public byte[] receive() {
        return new byte[]{
            120, 87
        };
    }
}
