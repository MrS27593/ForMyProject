package KlasowoObiektowo.Exceptions.IllegalStateException98Done;
import java.util.Iterator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        boolean initialized = true;
        if(!initialized){
            throw new IllegalStateException();
        }
    }
}
class Service{
    private boolean initialized = false;
    void init(){
        initialized = true;
    }
    void process(){
        if(!initialized){
            throw new IllegalStateException();
        }
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(1,5,3,4,6,7);
        Iterator<Integer> iterator = list.iterator();
//        iterator.remove();
//        stream.close();
//        stream.close(); // IllegalStateException (często)
//        entityManager.persist(entity); // po close()
//        Iterator<String> it = list.iterator();
//        it.remove(); // IllegalStateException
//        scanner.next(); // po close() → IllegalStateException
    }
}