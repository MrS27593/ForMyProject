package KlasowoObiektowo.Interfejsy.Serializable195MarkerDone;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Osoba osoba = new Osoba("Jan ",26);
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("osoba.ser"));

        outputStream.writeObject(osoba);
        outputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("osoba.ser"));
        Osoba osoba1 = (Osoba) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(osoba1.imie+" "+osoba1.wiek);

    }
}

class Osoba implements Serializable{
    String imie;
    int wiek;
    Osoba(String imie, int wiek){
        this.imie=imie;
        this.wiek=wiek;
    }
}
