package Projekty.GUI.Cwiczenia.c3.Task03_02;
interface Func {
    double apply(double x);
    static Func compose(Func f, Func g) {
//        return x -> f.apply(g.apply(x));
        return new Func() {
            @Override
            public double apply(double x) {
                return f.apply(g.apply(x));
            }
        };
    }
}
