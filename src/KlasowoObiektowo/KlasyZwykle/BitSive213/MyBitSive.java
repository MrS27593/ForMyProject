package KlasowoObiektowo.KlasyZwykle.BitSive213;

public class MyBitSive {
    public static void main(String[] args) {
        int limit = 100;
        boolean[] isComposite = new boolean[limit];

        for (int i = 2; i*i < limit; i++){
            if(!isComposite[i]){
                for(int j =  i * i ; j < limit ; j+=i){
                    isComposite[j] = true;
                }
            }
        }

        System.out.println("Liczby pierwsze do "+limit+" to :");
        for (int i = 2 ; i < limit ; i++){
            if(!isComposite[i]){
                System.out.println(i+" ");
            }
        }
    }
}
