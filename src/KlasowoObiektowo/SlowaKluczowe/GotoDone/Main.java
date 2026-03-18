package KlasowoObiektowo.SlowaKluczowe.GotoDone;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++){
            if(i==5) break;
        }

        outer:
            for (int i = 0 ; i < 5 ; i++){
                for (int j = 0 ; j < 5 ; j++){
                    if(i + j > 5){
                        break outer;
                    }
                }
            }

        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        boolean found = false;

        search:
        for(int i = 0 ; i< matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                if(matrix[i][j] == 5){
                    found = true;
                    break search;
                }
            }
        }

    }
}


