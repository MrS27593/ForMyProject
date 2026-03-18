package KlasowoObiektowo.KlasyAbstrakcyjne.OutputStream201Done;
import javax.imageio.IIOException;
import java.io.*;
import java.security.DigestOutputStream;
public class Main {
    public static void main(String[] args) throws IOException {
        OutputStream out = new DigitOutPutStream();
        String text = "a1b2c3";
        for (byte b : text.getBytes()) {
            out.write(b);
        }
        try(OutputStream outputStream = new FileOutputStream("plik.txt")){
            String text2 = "Hello World";
            outputStream.write(text.getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
class DigitOutPutStream extends OutputStream{
    @Override
    public void write(int b) throws IOException {
        if(Character.isDigit((char)b)){
            System.out.println((char)b);
        }
    }
}
