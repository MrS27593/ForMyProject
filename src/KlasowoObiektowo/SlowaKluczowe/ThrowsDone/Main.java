package KlasowoObiektowo.SlowaKluczowe.ThrowsDone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            readFile();
        }catch (IOException e){
            System.out.println("Błąd odczytu pliku");
        }

        try {
            A.method1();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile() throws IOException{
        FileReader fileReader = new FileReader("file.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        bufferedReader.close();
    }


}

class A {
     static void method1() throws IOException {
        method2();
    }

    static void method2() throws IOException {
        throw new IOException("Błąd");
    }
}
