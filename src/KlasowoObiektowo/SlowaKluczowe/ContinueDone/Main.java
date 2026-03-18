package KlasowoObiektowo.SlowaKluczowe.ContinueDone;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        while(i < 5){
            i++;
            if(i==3) {
                System.out.print(" ");
                continue;
            }
            System.out.print(i);
        }

        System.out.println();
        System.out.println();

        for(int a = 0; a < 5; a++){
            System.out.print(a);
            if (a==2){
                break;
            }
        }

        System.out.println();
        System.out.println();

    out:
        for(int b = 1; b <= 3 ; b++){
            for(int c = 1 ; c <= 3 ; c++){
                if (c==2){
                    continue out;
                }
                System.out.print(b+"-"+c+" ");
            }
        }

        System.out.println();
        System.out.println();

        for(int a = 1 ; a <= 10 ; a++){
            if (a%2!=0){
                continue;
            }
            System.out.print(a);
        }
    }




}
