package Projekty.GUI.Cwiczenia.c1.Task01_01;

public
    abstract class Singer {

    private static int counter = 1;

    private String name;
    private int number;

    public Singer(String name) {
        this.name = name;
        this.number = Singer.counter++;
    }

    abstract String sing();

    @Override
    public String toString() {
        return "(" + this.number +") " + this.name +": "+this.sing();
    }

    static String loudest(Singer[] singers){
        int countMax = Singer.countCapitals(singers[0].sing()),
            indexMax = 0;

        for(int i = 1; i < singers.length; i++) {
            int res = Singer.countCapitals(singers[i].sing());
            if(res > countMax){
                countMax = res;
                indexMax = i;
            }
        }
        return singers[indexMax].toString();
    }

    private static int countCapitals(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++)
            if( str.charAt(i) >= 'A' && str.charAt(i) <='Z')
                count++;
        return count;
    }
}
