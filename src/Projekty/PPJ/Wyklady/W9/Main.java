package Projekty.PPJ.Wyklady.W9;


public
class Main {

    public static void main(String[] args) {

        System.out.println(
                Cookie.val
        );

        //Cookie.val = 150;

        System.out.println(
                Cookie.val
        );

/*
        System.out.println(
            Cookie.weight // err
        );
*/
        Cookie raisinsCookie = new Cookie();
/*
        raisinsCookie.weight = 10;
        raisinsCookie.ingredient = "";
*/
        new Cookie();
        new Cookie();
        new Cookie();
        new Cookie();
    }
}

class Cookie {

    public static final int val = 100;

    private int weight;
    private String ingredient;

    public Cookie(){
        System.out.println("Cookie constructor: "+this);
        System.out.println(weight+" "+ingredient);
    }

}