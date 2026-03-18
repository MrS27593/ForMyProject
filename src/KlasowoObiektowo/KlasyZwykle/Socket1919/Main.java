package KlasowoObiektowo.KlasyZwykle.Socket1919;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class Main {
    //nie chcemy używać try i catch więc definiujemy, że metoda może rzucać wyjątkiem
    public static void main(String[] args) throws IOException {
        //Utworzenie gniazda servera na danym porcie
        ServerSocket serverSocket = new ServerSocket(8080);
        //Jeśli wcześniejszy kod się skompilował to informujemy o powstaniu servera
        System.out.println("Serwer uruchomiony");
        //Utworzenie gniazda klienta i połączenie go z gniazdem servera.
        Socket clientSocket = serverSocket.accept();
        //utworzenie gniazda klienta o danym hoscie i porcie
        //Socket, socket = new Socket("localhost", 8080);
        //Reader jako strumień utworzony ze strumienia od klienta
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        //Writer jako output strumienia przez klienta
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        //Wyświetlenie komunikatu
        out.println("Hello Server! ");
        //Sczytujemy odpowiedź
        String response = in.readLine();
        //Wypisujemy odpowiedź
        System.out.println("Odpowiedź "+ response);
        //Należy zamknąć gniazdo klienta
        clientSocket.close();
    }
}
