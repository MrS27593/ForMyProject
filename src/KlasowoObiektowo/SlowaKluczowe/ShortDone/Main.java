package KlasowoObiektowo.SlowaKluczowe.ShortDone;

public class Main {
    public static void main(String[] args) {
        short a =1000;
        short b = -300;
        b = 2000;
        short sum = (short) (a + b);
        short product = (short) (a * b);
        System.out.println(product);

        Grades grades1 = new Grades();
        Grades grades2 = new Grades();

    }
}
class Grades{
    short[] scores = new short[10];

    void addScore(int index, short score){
        scores[index]=score;
    }
}
