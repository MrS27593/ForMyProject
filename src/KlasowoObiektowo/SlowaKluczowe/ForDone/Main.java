package KlasowoObiektowo.SlowaKluczowe.ForDone;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 5 ; i++){
            System.out.println(i);
        }

        String[] names={"Ala","Ola","Ewa"};

        for(String name: names){
            System.out.println(name);
        }

        for(int i = 0, j = 10 ; i < j ; i++, j-- ){
            System.out.println(i+" "+j);
        }

//        for(;;){
//            System.out.println("Nieskończona pętla");
//        }

        for(int i = 0 ; i<10 ; i++){
            if(i==5) break;
            if (i%2 == 0)continue;
            System.out.println(i);
        }

        double[] orders = {120,50,300,80};

        double total = 0;
        for(double order:orders){
            if(order>100){
                total+=order*0.9;
            }else {
                total +=order;
            }
        }
        System.out.println("Suma "+total);
    }
}
