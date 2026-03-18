package KlasowoObiektowo.Interfejsy.ObjectStreamConstants245;
import java.io.*;
import java.io.Serializable;
import java.io.*;
public class MyInterfaceObjectStreamConstants extends ObjectOutputStream implements ObjectStreamConstants {
    public MyInterfaceObjectStreamConstants(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        // własny nagłówek strumienia
        writeShort(STREAM_MAGIC);
        writeShort(STREAM_VERSION);
    }
}



 class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}


class SerializeDemo {
    public static void main(String[] args) {
        String filename = "person.ser";

        // 1. Serializacja
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            Person p = new Person("Ala", 30);
            oos.writeObject(p);
            System.out.println("Obiekt zapisany: " + p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Deserializacja
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Person p = (Person) ois.readObject();
            System.out.println("Obiekt odczytany: " + p);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}