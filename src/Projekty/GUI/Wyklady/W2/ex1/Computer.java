package Projekty.GUI.Wyklady.W2.ex1;

//Publiczna klasa Computer
public
    class Computer {

    //Publiczna metoda niezwracająca  "connect" przyjmująca argument Interfejsu USB
    public void connect(USB usb){
        //Dla podanego argumentu interfejsu USB wywołana jest metoda "send" o argumentcie 1 jako tablica typu int
        usb.send(new byte[]{1});
        //Stworzenie tablicy "data" typu byte która przyjmuje wartość tablicy zwracanej metodą receive
        byte[] data = usb.receive();
        //Wyświetlenie komunikatu i wartości na zerowym indeksie tablicy
        System.out.println(
            "comp -> device id: " + data[0]
        );
    }
}
