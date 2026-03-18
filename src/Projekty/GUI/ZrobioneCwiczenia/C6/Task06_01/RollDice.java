package FinalneMarcinaIMoje.Task06_01;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

class  Roll implements Iterable<Integer> {

private int[] tab;

private int index = 0;

    public Roll(){
        this.tab=new int[3];
        this.index=3;
        for(int i = 0; i < tab.length; i++)
            tab[i]=(int) (Math.random()*6 + 1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                if(tab[0]+tab[1]+tab[2]==11)
                    return false;
                return true;
            }

            @Override
            public Integer next() {
                return tab[++index];
            }
        };
    }

    //====

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }
}

//========

public class RollDice {

    public static void main(String[] args) {


        for (int turn = 0; turn < 10; ++turn){
            for (Integer i : new Roll()){
                System.out.println(i + "");
            System.out.println();
            }
        }
    }
}

