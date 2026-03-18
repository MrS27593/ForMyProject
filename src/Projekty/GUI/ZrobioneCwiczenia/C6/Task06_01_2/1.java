package FinalneMarcinaIMoje.Task06_01_2;

import java.util.Iterator;
import java.util.Random;

class Roll implements Iterator<Integer>, Iterable<Integer>
{
    private static final Random random = new Random();
    private int numberOfElements = 0;
    private int lastOptions[] = new int[3];
    private int currentSum = 0;


    public class RollIterator implements Iterator<Integer>
    {

        @Override
        public boolean hasNext()
        {
            return false;
        }

        @Override
        public Integer next()
        {
            return null;
        }
    }

    @Override
    public Iterator<Integer> iterator()
    {
        return this;
    }

    @Override
    public boolean hasNext()
    {
        return currentSum == 11 && numberOfElements >= 3 ? false : true;
    }

    @Override
    public Integer next()
    {
        int number = random.nextInt(6)+1;
        int removedValue = 0;

        if (numberOfElements >= 3)
            removedValue = lastOptions[numberOfElements%3];

        lastOptions[numberOfElements%3] = number;

        currentSum -= removedValue;
        currentSum += number;
        numberOfElements++;

        return number;
    }
}


 class RollDice {
    public static void main(String[] args) {
        for (int turn = 0; turn < 10; ++turn) {
            for (Integer i : new Roll())
                System.out.print(i + " ");
            System.out.println();
        }
    }
}