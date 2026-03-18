package Projekty.PPJ.Wyklady.W6;

public
class Main {

    public static void main(String[] args) {
        {
            // przygotowac tablice
            int[] data = new int[100];

            // wypelnic tablice
            for (int i = 0; i < data.length; i++)
                data[i] = (int) (Math.random() * 10);

            // wyswietlic tablice
            System.out.print("[");
            for (int i = 0; i < data.length; i++)
                System.out.print(data[i] + ", ");
            System.out.println("]");

            // policzyc wystapiena zadanego elementu
            int x = 5; // szukana
            int count = 0; // licznik
            for (int i = 0; i < data.length; i++)
                if (data[i] == x)
                    count++;

            // wyswietlic wynik
            System.out.println("znaleziono: " + count);
        }
        {
            // przygotowac tablice
            int[] data = new int[100];

            // wypelnic tablice
            for (int i = 0; i < data.length; i++)
                data[i] = (int) (Math.random() * 10);

            // wyswietlic tablice
            System.out.print("[");
            /*
            for (int i = 0; i < data.length; i++)
                System.out.print(data[i] + ", ");
            */
            for( int value : data) {
                System.out.print(value + ", ");
                value = 0;
            }
            System.out.println("]");

            // policzyc wystapiena zadanego elementu
            int x = 5; // szukana
            int count = 0; // licznik
            for (int i = 0; i < data.length; i++)
                if (data[i] == x)
                    count++;

            // wyswietlic wynik
            System.out.println("znaleziono: " + count);
        }

        {
            char[] arr = new char[10];

            System.out.print("[");
            for(int i=0; i < arr.length; i++){
                arr[i] = (char)('A'+(Math.random()*('Z'-'A')));
                System.out.print(arr[i]);
            }
            System.out.println("]");

            // wysukaj min element
            char min = arr[0];
            for( int i=1; i < arr.length; i++)
                if(min > arr[i])
                    min = arr[i];

            System.out.println(min);
        }



        {
            char[] arr = new char[10];

            System.out.print("[");
            for(int i=0; i < arr.length; i++){
                arr[i] = (char)('A'+(Math.random()*('Z'-'A')));
                System.out.print(arr[i]);
            }
            System.out.println("]");

            // wysukaj min element
            int minValueIndex = 0;
            for( int i=1; i < arr.length; i++)
                if(arr[minValueIndex] > arr[i])
                    minValueIndex = i;

            System.out.println(arr[minValueIndex]);

            char tmp = arr[minValueIndex];
            arr[minValueIndex] = arr[0];
            arr[0] = tmp;

            System.out.print("[");
            for(char ch : arr)
                System.out.print(ch);
            System.out.println("]");
        }



        {
            char[] arr = new char[10];

            System.out.print("[");
            for(int i=0; i < arr.length; i++){
                arr[i] = (char)('A'+(Math.random()*('Z'-'A')));
                System.out.print(arr[i]);
            }
            System.out.println("]");

            for(int j=0; j < arr.length-1; j++) {
                int minValueIndex = j;
                for (int i = j + 1; i < arr.length; i++)
                    if (arr[minValueIndex] > arr[i])
                        minValueIndex = i;

                char tmp = arr[minValueIndex];
                arr[minValueIndex] = arr[j];
                arr[j] = tmp;
            }

            System.out.print("[");
            for(char ch : arr)
                System.out.print(ch);
            System.out.println("]");
        }




        {
            boolean[] logiArr = new boolean[10];
            System.out.println("logiArr.length = " + logiArr.length);

            boolean[] tmp = new boolean[logiArr.length*2];
            for(int i=0; i < logiArr.length; i++)
                tmp[i] = logiArr[i];

            logiArr = tmp;
            System.out.println("logiArr.length = " + logiArr.length);
        }




        {
            //int[][] arr = new int[10][10];
            int[][] arr = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };

            System.out.println("[");
            for(int i=0; i<arr.length; i++){
                System.out.print("[");
                for(int j=0; j<arr[i].length; j++) {
                    System.out.print(arr[i][j]+",");
                }
                System.out.println("]");
            }
            System.out.println("]");
        }



        {
            //int[][] arr = new int[10][10];
            int[][] arr = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };

            System.out.println("[");
            for( int[] row : arr){
                System.out.print("[");
                for(int value : row)
                    System.out.print(value+",");

                System.out.println("]");
            }
            System.out.println("]");
        }




        {
            //int[][][][][][][][][][] tab;
            int[][] tab = {
                    {1, 2, 3},
                    {4, 5},
                    {6}
            };
        }

    }
}

