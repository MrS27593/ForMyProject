package Projekty.GUI.Wyklady.W2.ex1;

//Publiczny interfejs "USB"
public
    interface USB {

    //metoda "send" nic niezwracająca a przyjmująca tablicę typy byte
    void send(byte[] data);

    //Metoda "receive" zwracająca tablicę typu byte
    byte[] receive();
}
