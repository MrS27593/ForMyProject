package Projekty.TPO.Cwiczenia.I_ProgramowanieKlientSerwer1;

import javax.naming.CommunicationException;
import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        //MulticastDatagramSocket
        try {
            ServerSocket serverSocket = new ServerSocket();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            Socket socket = new Socket();
        }catch(Exception e){
            throw new RuntimeException(e);
        }

        try {
            //Utworzenie gniazda
            String serverHost = "www.onet.pl";//adres IP servera (cyfrowo lub z użyciem DNS)
            int serverPort = 8080;              //Numer portu, na którym nasłuchuje serwer
            Socket socket = new Socket(serverHost, serverPort);
            //Uzyskanie Strumieni do komunikacji
            OutputStream sockOut = socket.getOutputStream();
            InputStream socketIn = socket.getInputStream();
            sockOut.write(1);
//            socketIn.read(1);
            sockOut.close();
            socketIn.close();
            socket.close();
        } catch (UnknownHostException UnkHostE) {
            throw new RuntimeException(UnkHostE);
        }catch(SocketException SckExc){
//            throw new CommunicationException(SckExc);
        }catch(IOException IOExcep){
            throw new IOError(IOExcep);
        }

        String host = "45.79.112.203";
        int port = 4242;

        try(Socket socket2 = new Socket(host,port)){
            OutputStream sos = socket2.getOutputStream();
            PrintWriter out = new PrintWriter(sos, true);
            InputStream sins = socket2.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(sins));
            String msg = "Moja wiadomość";
            out.println(msg);
            String resp = in.readLine();
            System.out.println("Odebrano wiadomość "+resp);
        }catch (UnknownHostException e){
            System.err.println("Nie znaleziono hosta: "+host);
        }catch (IOException e){
            System.err.println("Błąd I/O: "+e.getMessage());
        }

        String host3 = "132.162.97.1";
        int port3 = 13;
        try(Socket socket = new Socket(host,port)){
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            while ( (line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (UnknownHostException e){
            System.err.println("Nieznany host "+host3);
        }catch(Exception exc){
            System.err.println(exc);
        }

        String host4 = "https://x.y.z";
        int port4 = 13;
        try{
            //Utworzenie adresu
            InetAddress inetadr = InetAddress.getByName(host);
        }catch(UnknownHostException e){
            System.err.println("Nieznany adres"+host4);
        }
    }
}
