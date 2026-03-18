package KlasowoObiektowo.KlasyAbstrakcyjne.Writer392Done;

import java.io.IOException;
import java.io.Writer;

public class MyAbstractClassWriterExample {
    public static void main(String[] args) throws IOException {
        try {
            Writer.nullWriter().write('a');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Writer writer = new DigitWriter();
        writer.write("ajsad12321");
    }
}
class DigitWriter extends Writer{

    public void write(int c){
        if (Character.isDigit(c)){
            System.out.print((char)c);
        }
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        for(int i = off ; i < len; i++){
            write(cbuf[i]);
        }
    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public void close() throws IOException {

    }
}
