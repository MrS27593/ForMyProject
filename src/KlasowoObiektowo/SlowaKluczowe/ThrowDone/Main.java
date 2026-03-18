package KlasowoObiektowo.SlowaKluczowe.ThrowDone;

public class Main {
    public static void main(String[] args) {

    Main main = new Main();

            main.devide(4,0);

    }
    void read(){
        throw new IllegalArgumentException();
    }

      void devide(int a, int b){
        if (b==0){
            throw new ArithmeticException("Nie można dzielić przez 0");
        }else {
            System.out.println(a/b);
        }
    }
}
