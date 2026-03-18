package KlasowoObiektowo.SlowaKluczowe.BreakDone;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }

        int i = 0;
        while (i<10){
            if(i==3){
                break;
            }
            System.out.println(i);
            i++;
        }

        int day = 3;
        switch (day){
            case 1:
                System.out.println("poniedziałek");
                break;
            case 2:
                System.out.println("wtorek");
                break;
            case 3:
                System.out.println("sroda");
                break;
            default:
                System.out.println("inny dzień");
                break;
        }

        for (int a = 0; a < 3; a++){
            for (int b = 0; b < 5; b++){
                if (b==3){
                    break;
                }
                System.out.println("a = "+ a + "b = "+b);
            }
        }

        System.out.println();

        outloop:
        for (int a = 0; a < 3; a++){
            for (int b = 0; b < 5; b++){
                if (b==3){
                    break outloop;
                }
                System.out.println("a = "+ a + "b = "+b);
            }
        }
    }
}
