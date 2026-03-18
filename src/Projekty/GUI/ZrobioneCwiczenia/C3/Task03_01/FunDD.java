package FinalneMarcinaIMoje.Task03_01;

@FunctionalInterface //Zadeklarowanie Interfejsu funkcyjnego
interface FunDD {
    public double fun(double x); //Deklaracja Funckji o nazwie fun przyjmująca double i zwracająca double, każda metoda funkcyjna jest default public


    static double xminim(FunDD f, double a, double b) { //Statyczna metoda o nazwie xminm przyjmująca obiekt klasy implementującej, parametr typu double i kolejny pareametr typu double
        double minX = a;
        double step = 1e-5;
        double minWartoscY = f.fun(a);

        for (double i = a; i<=b; i = i+step){
            double currentResult = f.fun(i);
            if (currentResult < minWartoscY){
                minX = i;
                minWartoscY = currentResult;
            }
        }
        return minX;  //Zwracamy kandydataX czyli miejsce gdzie rzeczywiście wartośc funkcji to minimum
    }
}
