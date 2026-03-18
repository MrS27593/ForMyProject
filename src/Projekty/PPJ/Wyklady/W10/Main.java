package Projekty.PPJ.Wyklady.W10;

public
class Main {

    public static void main(String[] args) {

        CookieArray arr = new CookieArray();
        Cookie rCookie = new Cookie( 10, "rodzynki");
        arr.add(rCookie);

        rCookie = new Cookie(20);
        rCookie.show();

        arr.add(rCookie);
        arr.show();
        arr.add(rCookie.getHalf());
        arr.show();
        arr.getCookieAt(0).getHalf();
        arr.getCookieAt(0).getHalf();
        arr.getCookieAt(0).getHalf();
        arr.getCookieAt(0).getHalf();
        arr.show();

        // =============================

        System.out.println(
                rCookie.getWeight()
        );

        rCookie.setWeight(100);

/*
        Cookie[] tab = new Cookie[10];

        Cookie rCookie = new Cookie( 10, "rodzynki");
        tab[0] = rCookie;

        rCookie = new Cookie(20);
        rCookie.show();

        tab[1] = rCookie;

        System.out.println("==============");

        for(int i=0; i<2; i++)
            tab[i].show();

        tab[2] = rCookie.getHalf();

        System.out.println("==============");

        for(int i=0; i<3; i++)
            tab[i].show();

 */
    }

}
class CookieArray {
    private Cookie[] tab;
    private int fill;

    public CookieArray(){
        this.tab = new Cookie[10];
        this.fill = 0;
    }

    public void add(Cookie cookie){
        tab[fill] = cookie;
        fill = fill + 1;
    }

    public Cookie getCookieAt(int index){
        return tab[index];
    }

    public int size(){
        return fill;
    }

    public void show(){
        System.out.println("====================");
        for(int i = 0; i < fill; i++)
            tab[i].show();
        System.out.println("^^^^^^^^^^^^^^^^^^");
    }

}
class Cookie {
    private int weight;
    private final String ingredient;

    public Cookie(int weight, String ingredient){
        this.weight = weight;
        this.ingredient = ingredient;
    }

    public Cookie(int weight){
        this( weight, "czekolada");
/*
        this.weight = weight;
        this.ingredient = "czekolada";
*/
    }

    public void show(){
        System.out.println(
                "Cookie: "+this.weight+" "+this.ingredient
        );
    }

    public Cookie getHalf(){
        int newWeigth = this.weight / 2;
        this.weight = newWeigth;
        return new Cookie( newWeigth, this.ingredient);
    }

    public String getIngredient(){
        return this.ingredient;
    }

    public int getWeight(){
        return this.weight;
    }

    public void setWeight(int weight){
        System.out.println(
                "Waga ciasteczka nie może ulec zmianie."
        );
    }

}
