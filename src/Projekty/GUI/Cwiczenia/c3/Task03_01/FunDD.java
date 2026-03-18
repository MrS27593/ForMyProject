package Projekty.GUI.Cwiczenia.c3.Task03_01;

@FunctionalInterface
interface FunDD {
    double fun(double x);
    static double xminim(FunDD f, double a, double b) {
        double minVal = f.fun(a),
                X = a;
        for(double x = a; x <= b; x += 1e-5){
            double y = f.fun(x);
            if( minVal > y){
                minVal = y;
                X = x;
            }
        }
        return X;
    }
}
