package KlasowoObiektowo.KlasyAbstrakcyjne.InputStream789Done;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MyInputStream {
    public static void main(String[] args) {

        try(InputStream in = new FileInputStream("plik.txt")){
            int b;
            while((b=in.read())!=-1){
                System.out.println(b);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
class DigitInputStream extends InputStream{
    private final byte[] data;
    private int pos = 0;

    public DigitInputStream(String txt){
        data = txt.getBytes();
    }

    @Override
    public int read() throws IOException {
        while(pos<data.length){
            int b = data[pos++];
            if(Character.isDigit((char)b)){
                return b;
            }
        }
        return -1;
    }
}
