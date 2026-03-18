package KlasowoObiektowo.KlasyZwykle.Reader;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(Reader reader = new FileReader("C:\\Users\\HolvePC\\Desktop\\Java\\src\\WazneKlasy\\Reader\\plik.txt")){
            int znak;
            while((znak= reader.read()) != -1){
                System.out.println((char)znak);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception exception){
            System.out.println("Wystąpił jakikolwiek wyjątek");
        }

        System.out.println();

        try(Reader reader = new BufferedReader(new FileReader("C:\\Users\\HolvePC\\Desktop\\Java\\src\\WazneKlasy\\Reader\\plik.txt"))){
            if(reader.markSupported()){
                reader.mark(100);
            }

            char[] buffer = new char[10];
            int readCount = reader.read(buffer,0, buffer.length);
            System.out.println("Przeczytano: "+new String(buffer,0,readCount));

            if(reader.markSupported()){
                reader.reset();
                readCount = reader.read(buffer);
                System.out.println("Po resecie bufora: "+new String(buffer,0,readCount));
            }

            reader.skip(5);
            int znak = reader.read();
            System.out.println("Znak po pominięciu: "+(char)znak);

            Reader.nullReader();

        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

    }
}
