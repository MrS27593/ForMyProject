package KlasowoObiektowo.Interfejsy.Iterable104Done;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.StreamSupport;

public class MyIterableInterface implements Iterable<Integer>{
    private int start;
    private int end;

    public  MyIterableInterface(int start, int end){
        this.start=start;
        this.end=end;
    }
    public static void main(String[] args) {

        List<String> list = List.of("dom","dwór","villa","basen");

        for(String a: list){
            System.out.println(a);
        }

        MyIterableInterface main = new MyIterableInterface(10,29);

        for(int a : main){
            System.out.println(a);
        }

        MyCollection myCollection = new MyCollection(new int[]  {1,7,324,65,21,34});
        for(int a : myCollection) {
            System.out.println(a);
        }
            System.out.println();

        MyCollection myCollection1 = new MyCollection(new int[]{2,5,23,4,5,123,5234,1,4});
        Iterator<Integer> wskaznik= myCollection1.iterator();
        while(wskaznik.hasNext()){
            System.out.println(wskaznik.next());
        }

        MyCollection myCollection2 = new MyCollection(new int[] {2,5,12,5,67,214,6,1,2});
        StreamSupport.stream(myCollection2.spliterator(),false).forEach(System.out::println);
    }



    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int current = start;
            @Override
            public boolean hasNext() {
                return current<end;
            }

            @Override
            public Integer next() {
                return current++;
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }
}

class MyCollection implements Iterable<Integer>{
    private int[] dane;
    MyCollection(int[] dane){
        this.dane=dane;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < dane.length;
            }
            @Override
            public Integer next() {
                return dane[index++];
            }
        };
    }
    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }
    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }
}
