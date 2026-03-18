package Projekty.PPJ.Cwiczenia.C9;

public class Main {
    public static void main(String[] args) {
        System.out.println("=-=-=- Zadanie 1 -=-=-=");

        int[][] arr1 = {{1, 2, 3}, {4}, {5, 6}};
        int[][] arr2 = {{1, 2, 3}, {4}, {5, 6}};
        System.out.println(jestRowna(arr1, arr2));

        System.out.println("=-=-=- Zadanie 2 -=-=-=");

        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(200));

        System.out.println("=-=-=- Zadanie 3 -=-=-=");

        printMonth(12, 2022);

        System.out.println("=-=-=- Zadanie 4 -=-=-=");

        for (int[] tab : calculateSquares(1920, 1080, 100))
            System.out.println("(" + tab[0] + ", " + tab[1] + ")");

        System.out.println("=-=-=- Zadanie 5 -=-=-=");

        char[] tab1 = {'k', 'a', 'j', 'a', 'k'};
        char[] tab2 = {'K', 'a', 'j', 'a', 'k'};
        char[] tab3 = {'A', 'n', 'n', 'a'};
        char[] tab4 = {'a', 'n', 'n', 'a'};
        char[] tab5 = {'m', 'a', 'r', 's'};
        char[] tab6 = {'M', 'a', 'r', 's'};
        char[] tab7 = {'R', 'o', 'w', 'e', 'r'};

        System.out.println(isPalindrom(tab1));
        System.out.println(isPalindrom(tab2));
        System.out.println(isPalindrom(tab3));
        System.out.println(isPalindrom(tab4));
        System.out.println(isPalindrom(tab5));
        System.out.println(isPalindrom(tab6));
        System.out.println(isPalindrom(tab7));

        System.out.println("=-=-=- Zadanie 6 -=-=-=");

        printPalindrom(tab1);
        printPalindrom(tab2);
        printPalindrom(tab3);
        printPalindrom(tab4);
        printPalindrom(tab5);
        printPalindrom(tab6);
        printPalindrom(tab7);

    }

    public static boolean jestRowna(int[][] arr1, int[][] arr2){
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++)
            if (arr1[i].length != arr2[i].length)
                return false;

        for (int i = 0; i < arr1.length; i++)
            for (int j = 0; j < arr1[i].length; j++)
                if (arr1[i][j] != arr2[i][j])
                    return false;

        return true;
    }

    public static int countDigits(int number){
        int counter = 0;
        while (number > 0){
            counter++;
            number /= 10;
        }
        return counter;
    }

    public static int[] splitToDigits(int number){
        int[] tmp = new int[countDigits(number)];
        int index = tmp.length-1;
        while (number > 0){
            tmp[index--] = number % 10;
            number /= 10;
        }
        return tmp;
    }

    public static boolean isArmstrongNumber(int number){
        int[] tmp = splitToDigits(number);
        int sum = 0;

        for (int i = 0; i < tmp.length; i++)
            sum += Math.pow(tmp[i], tmp.length);

        return number == sum;
    }

    public static void printMonth(int m, int y){
        int days = calculateDaysOfMonth(m, y);
        int dayOfWeek = calculateDayOfWeek(m, y);

        int counter = 0;

        for (int i = 0; i < dayOfWeek; i++) {
            System.out.print("\t");
            counter++;
        }

        for (int i = 1; i <= days; i++) {
            System.out.print(i + "\t");
            counter++;
            if (counter % 7 == 0)
                System.out.println();
        }
        System.out.println();

    }

    public static int calculateDayOfWeek(int m, int y){
        // 1 stycznia 1 roku = poniedziałek

        int sumOfDays = 0;

        for (int i = 1; i <= y; i++)
            for (int j = 1; (i != y && j <= 12) || (i == y && j < m); j++)
                sumOfDays += calculateDaysOfMonth(j, i);

        return sumOfDays % 7;
    }

    public static int calculateDaysOfMonth(int m, int y){
        return switch (m){
            case 4, 6, 9, 11 -> 30;
            case 2 -> ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))?29:28;
            default -> 31;
        };
    }

    public static int[][] calculateSquares(int screenWidth, int screenHeight, int side){
        int w = screenWidth/side;
        int h = screenHeight/side;

        int[][] res = new int[w*h][2];

        for (int i = 0; i < h; i++)
            for (int j = 0; j < w; j++){
                res[i*w+j][0] = i * side;
                res[i*w+j][1] = j * side;
            }

        return res;
    }

    public static boolean isPalindrom(char[] arr){
        return isPalindrom(arr, 0);
    }

    public static boolean isPalindrom(char[] arr, int index){
        if (index > arr.length/2)
            return true;
        return (Character.toLowerCase(arr[index]) == Character.toLowerCase(arr[arr.length-1-index])) && isPalindrom(arr, index+1);
    }

    public static void printPalindrom(char[] arr){
        if (isPalindrom(arr))
            System.out.println(printPalindrom(arr, 0, ""));
    }

    public static String printPalindrom(char[] arr, int index, String res){
        if (index > arr.length/2-1)
            return res;
        return printPalindrom(arr, index+1, arr[index] + res + arr[arr.length-1-index]);
    }
}
