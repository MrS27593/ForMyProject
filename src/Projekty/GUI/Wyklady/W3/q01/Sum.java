package Projekty.GUI.Wyklady.W3.q01;


public
    class Sum
    implements Calculable {

    //Przysłonięcie metody z interfejsu funkcyjnego Calculabe
    @Override
    public int calculate(int val1, int val2) {
        //Po implementacji tej metody zaimplementowaliśmy liczenie sumy dwóch argumentów.
        return val1 + val2;
    }
}
